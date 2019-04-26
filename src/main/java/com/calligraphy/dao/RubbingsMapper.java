package com.calligraphy.dao;

import com.calligraphy.dto.Rubbings;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RubbingsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Rubbings record);

    int insertSelective(Rubbings record);


    Rubbings selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Rubbings record);

    int updateByPrimaryKey(Rubbings record);

    public List<Rubbings> list(@Param("keyword") String keyword, @Param("rubbingsType")Integer rubbingsType
            ,@Param("start")Integer start,@Param("end")Integer end);

    public List<Rubbings> mycollect(@Param("keyword")String keyword,@Param("userId")String userId
            ,@Param("start")Integer start,@Param("end")Integer end);

    public Integer listcount(@Param("keyword") String keyword, @Param("rubbingsType")Integer rubbingsType
            );

    public Integer mycollectcount(@Param("keyword")String keyword,@Param("userId")String userId
            );

    public void addcollect(@Param("rubbingsId")String rubbingsId,@Param("userId")String userId);

    public List<Rubbings> hotlist();

    public void canclecollect(@Param("rubbingsId")String rubbingsId,@Param("userId")String userId);

}