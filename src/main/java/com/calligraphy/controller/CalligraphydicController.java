package com.calligraphy.controller;

import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.dto.Course;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.CalligraphydicService;
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
@RequestMapping(value = "/calligraphydic")
public class CalligraphydicController {

    @Resource
    CalligraphydicService calligraphydicService;

    @ResponseBody
    @RequestMapping("/dicList")
    public ResponseData dicList(String keyword,Integer pageSize,Integer pageNum,Integer type){
        ResponseData responseData;
        List<Calligraphydic> data;
        try {
            data = calligraphydicService.diclist(keyword,type,(pageNum-1)* pageSize,pageNum*pageSize);
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Calligraphydic d: data){
                Map<String,Object> map = new HashMap<>();
                map.put("source",d.getSource());
                map.put("dicUrl",d.getDicurl());
                maps.add(map);
            }
            responseData =  new ResponseData(true,"",maps);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }
}
