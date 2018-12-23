package com.calligraphy.controller;

import com.alibaba.fastjson.JSON;
import com.calligraphy.dto.TestDto;
import com.calligraphy.service.TestDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringredisTemplate;

    @Resource
    TestDtoService testDtoService;

    @ResponseBody
    @RequestMapping("/my")
    public String test(){
        return "test";
    }

    @RequestMapping("/getmy")
    public String gettest(){
        stringredisTemplate.opsForValue().set("test","100",200);
        String text = stringredisTemplate.opsForValue().get("test");
        return text == null ?"redis timeout":text;
    }

    @RequestMapping("/add")
    public String save(){
        TestDto testDto = new TestDto();
        testDto.setId(1);
        testDto.setStr("aaaa");
        testDto.setIns(22);
        testDtoService.save(testDto);
        return "";
    }

    @RequestMapping("/find")
    public String find(){
        return JSON.toJSONString(testDtoService.find(1));
    }
}
