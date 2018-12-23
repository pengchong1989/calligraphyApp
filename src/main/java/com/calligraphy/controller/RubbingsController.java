package com.calligraphy.controller;

import com.calligraphy.dto.Coursetype;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.dto.Rubbings;
import com.calligraphy.service.RubbingsSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/runbbings")
public class RubbingsController {

    @Resource
    RubbingsSevice rubbingsSevice;

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
                map.put("url",type.getRubbingsurl());
                maps.add(map);
            }
            responseData =  new ResponseData(true,"",maps);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",list);
        }
        return responseData;
    }

    @RequestMapping("/collect")
    @ResponseBody
    public ResponseData addCollect(String rubbingsId,String userId){
        ResponseData responseData = null;
        try {
            rubbingsSevice.addcollect(rubbingsId,userId);
            responseData =  new ResponseData(true,"",null);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }
}
