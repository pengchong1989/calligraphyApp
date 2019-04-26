package com.calligraphy.controller;

import com.calligraphy.dto.ResponseData;
import com.calligraphy.service.ClientVserionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/version")
public class VersionController {

    @Resource
    ClientVserionService clientVserionService;

    @RequestMapping("/check")
    @ResponseBody
    public ResponseData checkVsersion(Integer versiontype){
        return new ResponseData(true,"",clientVserionService.queryNew(versiontype));
    }
}
