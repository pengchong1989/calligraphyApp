package com.calligraphy.service.impl;

import com.calligraphy.dao.UserMapper;
import com.calligraphy.dto.AppUser;
import com.calligraphy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userSevice")
public class UserServiceImpl implements UserService{

    @Resource
    UserMapper userMapper;

    @Override
    public AppUser findUser(String userName, String serialNumber) {
        return userMapper.findUser(userName,serialNumber);
    }

    @Override
    public void avtive(String id) {
        userMapper.active(id);
    }
}
