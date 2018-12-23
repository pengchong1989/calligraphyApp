package com.calligraphy.controller;

import com.calligraphy.dto.Course;
import com.calligraphy.dto.Coursetype;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/course")
@Controller
public class CourseController {
    @Resource
    private CourseService courseService;

    @ResponseBody
    @RequestMapping("/courseTypeList")
    public ResponseData courseTypeList(String fristTypeId,Integer pageSize,Integer pageNum){
        ResponseData responseData;
        List<Coursetype> data;
        try {
            data = courseService.courseTypeList(fristTypeId,pageSize,pageNum);
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Coursetype type: data){
                Map<String,Object> map = new HashMap<>();
                map.put("name",type.getName());
                map.put("id",type.getId());
                map.put("url",type.getUrl());
                map.put("sort",type.getSort());
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
    @RequestMapping("/courseList")
    public ResponseData courseList(String secondTypeId, String keyword,Integer pageSize,Integer pageNum){
        ResponseData responseData;
        List<Course> data;
        try {
            data = courseService.courseList(secondTypeId,keyword,pageSize,pageNum);
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Course d: data){
                Map<String,Object> map = new HashMap<>();
                map.put("coursename",d.getCoursename());
                map.put("id",d.getId());
                map.put("cover",d.getCover());
                map.put("sort",d.getSort());
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
    @RequestMapping("/courseDetail")
    public ResponseData courseDetail(String courseId){
        ResponseData responseData;
        List<Course> data;
        List<String> urls = new ArrayList<>();
        Course course = null;
        try {
            data = courseService.findCourse(courseId);
            for(int i = 0;i<data.size();i++){
                if(i == 0){
                    course = data.get(0);
                }
                urls.add(course.getCover());
            }
            if(course == null){
                responseData =  new ResponseData(false,"course not exist",null);
            }else{
                Map<String,Object> map = new HashMap<>();
                map.put("coursename",course.getCoursename());
                map.put("urls",urls);
                map.put("id",course.getId());
                responseData =  new ResponseData(true,"",map);
            }

        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"error",null);
        }
        return responseData;
    }
}
