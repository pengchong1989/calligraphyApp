package com.calligraphy.dao;

import com.calligraphy.dto.TestDto;

public interface TestDtoMapper {

    public Integer insert(TestDto testDto);

    public TestDto find(Integer id);
}
