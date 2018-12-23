package com.calligraphy.service.impl;

import com.calligraphy.dao.CourseMapper;
import com.calligraphy.dao.CoursetypeMapper;
import com.calligraphy.dto.Course;
import com.calligraphy.dto.Coursetype;
import com.calligraphy.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CourseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    CourseMapper courseMapper;

    @Resource
    CoursetypeMapper coursetypeMapper;

    @Override
    public List<Coursetype> courseTypeList(String fristTypeId,Integer pageSize,Integer pageNum) {
        return coursetypeMapper.courseTypeList(fristTypeId,(pageNum-1)*pageSize,pageNum*pageSize);
    }

    @Override
    public List<Course> courseList(String secondTypeId, String keyword,Integer pageSize,Integer pageNum) {
        return courseMapper.courseList(secondTypeId,keyword,(pageNum-1)*pageSize,pageNum*pageSize);
    }

    @Override
    public List<Course> findCourse(String courseId) {
        return courseMapper.findCourse(courseId);
    }
}
