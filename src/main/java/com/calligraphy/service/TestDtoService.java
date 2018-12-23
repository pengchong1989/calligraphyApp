package com.calligraphy.service;

import com.calligraphy.dto.TestDto;

public interface TestDtoService {
    public Integer save(TestDto TestDto);

    public TestDto find(Integer id);
}
