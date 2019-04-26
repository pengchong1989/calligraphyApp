package com.calligraphy.service;

import com.calligraphy.dto.Course;
import com.calligraphy.dto.Coursetype;

import java.util.List;

public interface CourseService {
    public List<Coursetype> courseTypeList(String fristTypeId,Integer pageSize,Integer pageNum);
    public Integer courseTypeListcount(String fristTypeId);
    public List<Course> courseList(String secondTypeId,String keyword,Integer pageSize,Integer pageNum);
    public Integer courseListcount(String secondTypeId,String keyword);
    public Course findCourse(String courseId);


}
