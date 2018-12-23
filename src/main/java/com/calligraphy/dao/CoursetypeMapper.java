package com.calligraphy.dao;

import com.calligraphy.dto.Coursetype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursetypeMapper {

    int deleteByPrimaryKey(String id);

    int insert(Coursetype record);

    int insertSelective(Coursetype record);

    Coursetype selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Coursetype record);

    int updateByPrimaryKey(Coursetype record);

    public List<Coursetype> courseTypeList(@Param("fristTypeId") String fristTypeId
            ,@Param("start")Integer start,@Param("end")Integer end);
}