package com.calligraphy.dao;

import com.calligraphy.dto.Copybook;
import com.calligraphy.dto.Copybookurls;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CopybookMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Copybook record);

    int insertSelective(Copybook record);

    Copybook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Copybook record);

    int updateByPrimaryKey(Copybook record);

    List<Copybook> myCopybook(@Param("userId") String userId
            ,@Param("start")Integer start,@Param("end")Integer end);

    void insertBatch(@Param("list")List<Copybookurls> list);

    Integer myCopybookCount(@Param("userId") String userId);
    Integer deletemy(@Param("id")Integer id, @Param("userId")String userId);
}