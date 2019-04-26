package com.calligraphy.controller;

import com.calligraphy.dto.AppUser;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.UserService;
import com.calligraphy.util.ContansUtil;
import com.calligraphy.util.SymmetricEncoder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/active")
    public ResponseData active(String userName,String serialNumber){
        ResponseData responseData;
        if(StringUtils.isBlank(userName)){
            responseData = new ResponseData(false,"userName is null",null);
        }else if(StringUtils.isBlank(serialNumber)){
            responseData = new ResponseData(false,"serialNumber is null",null);
        }else{
            AppUser appUser = userService.findUser(userName,serialNumber);
            if(appUser == null){
                responseData = new ResponseData(false,"用户名和激活码不匹配",null);
            }else if(appUser.getHasActived() !=null){
                if("jx001".equals(userName)||"jx002".equals(userName)){
                    Map<String,String> map = new HashMap<>();
                    map.put("token", SymmetricEncoder.AESEncode(ContansUtil.aeskey,userName));
                    map.put("userid",appUser.getId());
                    responseData = new ResponseData(true,"",map);
                }else{
                    responseData = new ResponseData(false,"用户已经激活",null);
                }
            }else if (appUser.getHasActived()== null
                    && StringUtils.isNoneBlank(appUser.getId())){
                userService.avtive(appUser.getId());
                Map<String,String> map = new HashMap<>();
                map.put("token", SymmetricEncoder.AESEncode(ContansUtil.aeskey,userName));
                map.put("userid",appUser.getId());
                responseData = new ResponseData(true,"",map);
            }else{
                responseData = new ResponseData(false,"error",null);
            }
        }
        return responseData;
    }
}
