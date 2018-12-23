package com.calligraphy.service;

import com.calligraphy.dao.TestDtoMapper;
import com.calligraphy.dto.TestDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TestDtoService")
public class TestDtoServiceImpl implements  TestDtoService{

    @Resource
    private TestDtoMapper testDtoMapper;
    @Override
    public Integer save(TestDto TestDto) {
        return testDtoMapper.insert(TestDto);
    }

    @Override
    public TestDto find(Integer id) {
        return testDtoMapper.find(id);
    }
}
