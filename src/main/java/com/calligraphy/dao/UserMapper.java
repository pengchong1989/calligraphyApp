package com.calligraphy.dao;

import com.calligraphy.dto.AppUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    AppUser findUser(@Param("userName") String userName, @Param("serialNumber")String serialNumber);

    void active(@Param("id") String id);
}
