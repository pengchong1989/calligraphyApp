package com.calligraphy.service;

import com.calligraphy.dto.AppUser;

public interface UserService {
    AppUser findUser(String userName,String serialNumber);

    void avtive(String id);
}
