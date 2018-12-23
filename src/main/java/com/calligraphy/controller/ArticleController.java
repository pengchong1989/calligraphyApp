package com.calligraphy.controller;

import com.calligraphy.dto.Article;
import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.ArticleService;
import com.calligraphy.util.ContansUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {
    @Resource
    ArticleService articleService;

    @ResponseBody
    @RequestMapping("/list")
    public ResponseData dicList(String keyword, Integer type,Integer pageSize,Integer pageNum){
        ResponseData responseData;
        List<Article> data;
        try {
            data = articleService.articleList(keyword,type,(pageNum-1)* pageSize,pageNum*pageSize);
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Article d: data){
                Map<String,Object> map = new HashMap<>();
                map.put("title",d.getTitle());
                map.put("content",d.getContent());
                map.put("id",d.getId());
                maps.add(map);
            }
            responseData =  new ResponseData(true,"",maps);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }

    @ResponseBody
    @RequestMapping("/detail")
    public ResponseData articleDetail(String articleId){
        ResponseData responseData;
        Article data;
        try {
            data = articleService.queryByid(articleId);
            if(data.getId() != null){
                Map<String,Object> map = new HashMap<>();
                map.put("id",data.getId());
                map.put("title",data.getTitle());
                map.put("author",data.getAuthor());
                map.put("content",data.getContent());
                responseData =  new ResponseData(true,"",map);
            }else{
                responseData =  new ResponseData(false,"article not exist",null);
            }

        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }
}
