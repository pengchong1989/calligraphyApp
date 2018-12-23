package com.calligraphy.controller;

import com.calligraphy.dto.ResponseData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/active")
    public ResponseData active(String userName,String serialNumber){
        ResponseData responseData;
        if(StringUtils.isBlank(userName)){
            responseData = new ResponseData(false,"userName is null",null);
        }else if(StringUtils.isBlank(serialNumber)){
            responseData = new ResponseData(false,"serialNumber is null",null);
        }else{
            responseData = new ResponseData(true,"",null);
        }
        return responseData;
    }
}
