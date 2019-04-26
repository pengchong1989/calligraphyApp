package com.calligraphy.controller;

import com.calligraphy.config.redis.RedisPatternTopic;
import com.calligraphy.dto.Article;
import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.ArticleService;
import com.calligraphy.util.ContansUtil;
import com.calligraphy.util.RedisKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {
    @Resource
    ArticleService articleService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @ResponseBody
    @RequestMapping("/list")
    public ResponseData dicList(String keyword, Integer type, Integer pageSize, Integer pageNum) {
        ResponseData responseData;
        List<Article> data;
        try {
            data = articleService.articleList(keyword, type, (pageNum - 1) * pageSize, pageNum * pageSize);
            List<Map<String, Object>> maps = new ArrayList<>();
            for (Article d : data) {
                Map<String, Object> map = new HashMap<>();
                map.put("title", d.getTitle());
                map.put("content", d.getContent());
                map.put("id", d.getId());
                maps.add(map);
            }
            Map<String, Object> map = new HashMap<>();
            map.put("total", articleService.articleListcount(keyword, type));
            map.put("curNum", pageNum);
            map.put("list", maps);
            responseData = new ResponseData(true, "", map);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false, "", null);
        }
        return responseData;
    }

    @ResponseBody
    @RequestMapping("/detail")
    public ResponseData articleDetail(String articleId, String userId) {
        ResponseData responseData;
        Article data;
        stringRedisTemplate.convertAndSend(RedisPatternTopic.readnum, userId + "_" + articleId);
        try {
            data = articleService.queryByid(articleId);
            if (data.getId() != null) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", data.getId());
                map.put("title", data.getTitle());
                map.put("author", data.getAuthor());
                map.put("content", data.getContent());
                map.put("praisenum", data.getPraisenum());
                map.put("readnum", data.getRednum());
                map.put("reportednum", data.getReportednum());
                map.put("haspraise", stringRedisTemplate.opsForHash().hasKey(RedisKey.article_user_praise + userId, articleId));
                map.put("hasreporte", stringRedisTemplate.opsForHash().hasKey(RedisKey.article_user_reported + userId, articleId));
                responseData = new ResponseData(true, "", map);
            } else {
                responseData = new ResponseData(false, "article not exist", null);
            }

        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false, "", null);
        }
        return responseData;
    }

    @ResponseBody
    @RequestMapping("/operation")
    public ResponseData articleOperation(String articleId, String userId, Integer type) {

        if (type == 1) {
            stringRedisTemplate.convertAndSend(RedisPatternTopic.praisenum, userId + "_" + articleId);
            stringRedisTemplate.opsForHash().put(RedisKey.article_user_praise + userId, articleId, userId);
        } else if (type == 2) {
            stringRedisTemplate.convertAndSend(RedisPatternTopic.reportednum, userId + "_" + articleId);
            stringRedisTemplate.opsForHash().put(RedisKey.article_user_reported + userId, articleId, userId);
        }
        return new ResponseData(true, "", null);
    }

    public static void main(String[] args) {
        String strHtml = "方面必须有重点，不可乱了步骤。乱了就会事倍功半，看起来似乎进度快，实际效果不佳，反而慢了。这里要提醒的是，一家帖都未真正熟练，就去临另外的帖，朝三暮四，最后哪家帖也未真正掌握，这显然是很难提高自己水平的。&lt;/p&gt;";
        String txtcontent = strHtml.replaceAll("</?[^>]+>", "");//剔出<html>的标签    
        txtcontent = txtcontent.replaceAll("<a>\\s*|\t|\r|\n</a>", "");//去除字符串中的空格,回车,换行符,制表符    
        System.out.println(txtcontent);
    }
}
