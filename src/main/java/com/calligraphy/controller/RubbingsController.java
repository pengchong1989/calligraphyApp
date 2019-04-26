package com.calligraphy.controller;

import com.calligraphy.dto.Coursetype;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.dto.Rubbings;
import com.calligraphy.service.RubbingsSevice;
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
@RequestMapping(value = "/rubbings")
public class RubbingsController {

    @Resource
    RubbingsSevice rubbingsSevice;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(String userId,Integer mycollect,String keyword,Integer rubbingsType,Integer pageSize,Integer pageNum){
        ResponseData responseData = null;
        List<Rubbings> list = new ArrayList<>();
        try {
            if(mycollect == 0){
                list = rubbingsSevice.list(keyword,rubbingsType,pageSize,pageNum);
            }else if(mycollect == 1){
                list = rubbingsSevice.mycollect(keyword,userId,pageSize,pageNum);
            }
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Rubbings type: list){
                Map<String,Object> map = new HashMap<>();
                map.put("name",type.getName());
                map.put("id",type.getId());
                map.put("url", ContansUtil.osshead+type.getRubbingsurl());
                map.put("hascollect",stringRedisTemplate.opsForHash().hasKey(RedisKey.runnbing_collect+userId,type.getId()));
                maps.add(map);
            }
            Map<String,Object> map = new HashMap<>();
            map.put("total",mycollect == 0?rubbingsSevice.listcount(keyword,rubbingsType):rubbingsSevice.mycollectcount(keyword,userId));
            map.put("curNum",pageNum);
            map.put("list",maps);
            responseData =  new ResponseData(true,"",map);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",list);
        }
        return responseData;
    }

    @RequestMapping("/collectoperation")
    @ResponseBody
    public ResponseData addCollect(String rubbingsId,String userId,Integer operation){
        ResponseData responseData = null;
        try {
            if(operation == 1){
                stringRedisTemplate.opsForHash().put(RedisKey.runnbing_collect+userId,rubbingsId,userId);
                rubbingsSevice.addcollect(rubbingsId,userId);
            }else if(operation == 0){
                stringRedisTemplate.opsForHash().delete(RedisKey.runnbing_collect+userId,rubbingsId);
                rubbingsSevice.canclecollect(rubbingsId,userId);
            }

            responseData =  new ResponseData(true,"",null);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }

    @RequestMapping("/hot")
    @ResponseBody
    public ResponseData hot(String userId){
        ResponseData responseData = null;
        try {
            List<Rubbings> list = rubbingsSevice.hotlist();
            List<Map<String,Object>> data = new ArrayList<>();
            for(Rubbings type: list){
                Map<String,Object> map = new HashMap<>();
                map.put("name",type.getName());
                map.put("id",type.getId());
                map.put("url",ContansUtil.osshead+type.getRubbingsurl());
                map.put("hascollect",stringRedisTemplate.opsForHash().hasKey(RedisKey.runnbing_collect+userId,type.getId()));
                data.add(map);
            }
            responseData =  new ResponseData(true,"",data);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }

}
