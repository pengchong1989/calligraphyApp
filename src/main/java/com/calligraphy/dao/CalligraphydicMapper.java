package com.calligraphy.dao;

import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.dto.Dicvideo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CalligraphydicMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Calligraphydic record);

    int insertSelective(Calligraphydic record);

    Calligraphydic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Calligraphydic record);

    int updateByPrimaryKey(Calligraphydic record);

    public List<Calligraphydic> diclist(@Param("keyword") String keyword,@Param("dictype") Integer type,@Param("start")Integer start,@Param("end")Integer end);
    public Integer diclistcount(@Param("keyword") String keyword,@Param("dictype")Integer type);

    public List<Dicvideo> dicvideolist(@Param("keyword") String keyword, @Param("start")Integer start, @Param("end")Integer end);

    public Integer dicvideolistcount(@Param("keyword") String keyword);

}
