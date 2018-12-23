package com.calligraphy.controller;

import com.calligraphy.dto.Copybook;
import com.calligraphy.dto.Course;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.CopybookSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/copybook")
public class CopybookController {
    @Resource
    CopybookSevice copybookSevice;

    @ResponseBody
    @RequestMapping("/mycopybook")
    public ResponseData dicList(String userId,Integer pageSize,Integer pageNum){
        ResponseData responseData;
        List<Copybook> data;
        try {
            data = copybookSevice.myCopybook(userId,pageSize,pageNum);
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Copybook d: data){
                Map<String,Object> map = new HashMap<>();
                map.put("name",d.getName());
                map.put("id",d.getId());
                map.put("urls",d.getUrls());
                map.put("columnnum",d.getColumnnum());
                map.put("rownum",d.getRownum());
                map.put("backtype",d.getBacktype());
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
    @RequestMapping("/addCopybook")
    public ResponseData addCopybook(Copybook copybook){
        ResponseData responseData;
        try {
            copybookSevice.addCopybook(copybook);
            responseData =  new ResponseData(true,"",null);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"",null);
        }
        return responseData;
    }
}
