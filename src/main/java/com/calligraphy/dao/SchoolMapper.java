package com.calligraphy.dao;

import com.calligraphy.dto.School;

public interface SchoolMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);


    School selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}