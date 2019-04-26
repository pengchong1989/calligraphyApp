package com.calligraphy.controller;

import com.alibaba.fastjson.JSONObject;
import com.calligraphy.dto.Course;
import com.calligraphy.dto.Coursetype;
import com.calligraphy.dto.ResourceData;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.CourseService;
import com.calligraphy.util.ContansUtil;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RequestMapping("/course")
@RestController
public class CourseController {
    @Resource
    private CourseService courseService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @ResponseBody
    @RequestMapping("/courseTypeList")
    public ResponseData courseTypeList(String firstTypeId,Integer pageSize,Integer pageNum){
        ResponseData responseData;
        List<Coursetype> data;
        try {
            data = courseService.courseTypeList(firstTypeId,pageSize,pageNum);
            List<Map<String,Object>> maps = new ArrayList<>();
            for(Coursetype type: data){
                Map<String,Object> map = new HashMap<>();
                map.put("name",type.getName());
                map.put("id",type.getId());
                map.put("url",ContansUtil.osshead+type.getUrl());
                map.put("sort",type.getSort());
                maps.add(map);
            }
            Map<String,Object> map = new HashMap<>();
            map.put("total",courseService.courseTypeListcount(firstTypeId));
            map.put("curNum",pageNum);
            map.put("list",maps);
            responseData =  new ResponseData(true,"",map);
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
                map.put("cover", ContansUtil.osshead+d.getCover());
                map.put("sort",d.getSort());
                maps.add(map);
            }
            Map<String,Object> map = new HashMap<>();
            map.put("total",courseService.courseListcount(secondTypeId,keyword));
            map.put("curNum",pageNum);
            map.put("list",maps);
            responseData =  new ResponseData(true,"",map);
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
        Course course = null;
        try {
            course = courseService.findCourse(courseId);
            if(course == null){
                responseData =  new ResponseData(false,"course not exist",null);
            }else{
                Map<String,Object> map = new HashMap<>();
                map.put("coursename",course.getCoursename());
                map.put("resource",geturls(course));
                map.put("id",course.getId());
                responseData =  new ResponseData(true,"",map);
            }

        } catch (Exception e) {
            e.printStackTrace();
            responseData = new ResponseData(false,"error",null);
        }
        return responseData;
    }

    @RequestMapping("/test")
    public String test(){
        Map<Object,Object> map = stringRedisTemplate.opsForHash().entries("video_num");
        Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            String url = (String)entry.getValue();
            stringRedisTemplate.opsForHash().put("video_num",entry.getKey(),url.split("\\?"+"Expires")[0]);
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        System.out.println(JSONObject.toJSON(map));
        return "";
    }

    public List<ResourceData> geturls(Course course){
        List<ResourceData> list = new ArrayList<>();

        ResourceData data1 = new ResourceData(ContansUtil.osshead+course.getUrl1(), StringUtils.isNoneBlank(course.getVideo1())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo1()):"");
        if(!ContansUtil.osshead.equals(data1.getPicurl()) && data1.getVideourl() != null){
            list.add(data1);
        }
        ResourceData data2 = new ResourceData(ContansUtil.osshead+course.getUrl2(), StringUtils.isNoneBlank(course.getVideo2())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo2()):"");
        if(!ContansUtil.osshead.equals(data2.getPicurl()) && data2.getVideourl() != null){
            list.add(data2);
        }
        ResourceData data3 = new ResourceData(ContansUtil.osshead+course.getUrl3(), StringUtils.isNoneBlank(course.getVideo3())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo3()):"");
        if(!ContansUtil.osshead.equals(data3.getPicurl()) && data3.getVideourl() != null){
            list.add(data3);
        }
        ResourceData data4 = new ResourceData(ContansUtil.osshead+course.getUrl4(), StringUtils.isNoneBlank(course.getVideo4())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo4()):"");
        if(!ContansUtil.osshead.equals(data4.getPicurl()) && data4.getVideourl() != null){
            list.add(data4);
        }
        ResourceData data5 = new ResourceData(ContansUtil.osshead+course.getUrl5(), StringUtils.isNoneBlank(course.getVideo5())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo5()):"");
        if(!ContansUtil.osshead.equals(data5.getPicurl()) && data5.getVideourl() != null){
            list.add(data5);
        }
        ResourceData data6 = new ResourceData(ContansUtil.osshead+course.getUrl6(), StringUtils.isNoneBlank(course.getVideo6())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo6()):"");
        if(!ContansUtil.osshead.equals(data6.getPicurl()) && data6.getVideourl() != null){
            list.add(data6);
        }
        ResourceData data7 = new ResourceData(ContansUtil.osshead+course.getUrl7(), StringUtils.isNoneBlank(course.getVideo7())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo7()):"");
        if(!ContansUtil.osshead.equals(data7.getPicurl()) && data7.getVideourl() != null){
            list.add(data7);
        }
        ResourceData data8 = new ResourceData(ContansUtil.osshead+course.getUrl8(), StringUtils.isNoneBlank(course.getVideo8())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo8()):"");
        if(!ContansUtil.osshead.equals(data8.getPicurl()) && data8.getVideourl() != null){
            list.add(data8);
        }
        ResourceData data9 = new ResourceData(ContansUtil.osshead+course.getUrl9(), StringUtils.isNoneBlank(course.getVideo9())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo9()):"");
        if(!ContansUtil.osshead.equals(data9.getPicurl()) && data9.getVideourl() != null){
            list.add(data9);
        }
        ResourceData data10 = new ResourceData(ContansUtil.osshead+course.getUrl10(), StringUtils.isNoneBlank(course.getVideo10())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo10()):"");
        if(!ContansUtil.osshead.equals(data10.getPicurl()) && data10.getVideourl() != null){
            list.add(data10);
        }
        ResourceData data11 = new ResourceData(ContansUtil.osshead+course.getUrl11(), StringUtils.isNoneBlank(course.getVideo11())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo11()):"");
        if(!ContansUtil.osshead.equals(data11.getPicurl()) && data11.getVideourl() != null){
            list.add(data11);
        }
        ResourceData data12 = new ResourceData(ContansUtil.osshead+course.getUrl12(), StringUtils.isNoneBlank(course.getVideo12())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo12()):"");
        if(!ContansUtil.osshead.equals(data12.getPicurl()) && data12.getVideourl() != null){
            list.add(data12);
        }
        ResourceData data13 = new ResourceData(ContansUtil.osshead+course.getUrl13(), StringUtils.isNoneBlank(course.getVideo13())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo13()):"");
        if(!ContansUtil.osshead.equals(data13.getPicurl()) && data13.getVideourl() != null){
            list.add(data13);
        }
        ResourceData data14 = new ResourceData(ContansUtil.osshead+course.getUrl14(), StringUtils.isNoneBlank(course.getVideo14())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo14()):"");
        if(!ContansUtil.osshead.equals(data14.getPicurl()) && data14.getVideourl() != null){
            list.add(data14);
        }
        ResourceData data15 = new ResourceData(ContansUtil.osshead+course.getUrl15(), StringUtils.isNoneBlank(course.getVideo15())?stringRedisTemplate.opsForHash().get("video_num",course.getVideo15()):"");
        if(!ContansUtil.osshead.equals(data15.getPicurl()) && data15.getVideourl() != null){
            list.add(data15);
        }
        return list;
    }
}
