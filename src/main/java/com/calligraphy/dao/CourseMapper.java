package com.calligraphy.dao;

import com.calligraphy.dto.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {

    int deleteByPrimaryKey(String id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    public List<Course> courseList(@Param("secondTypeId")String secondTypeId,@Param("keyword") String keyword
            ,@Param("start")Integer start,@Param("end")Integer end);

    public List<Course> findCourse(@Param("courseId")String courseId);
}