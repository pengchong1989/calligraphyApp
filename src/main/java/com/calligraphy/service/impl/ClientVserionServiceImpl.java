package com.calligraphy.service.impl;

import com.calligraphy.dao.ClientVserionMapper;
import com.calligraphy.dto.ClientVserion;
import com.calligraphy.service.ClientVserionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ClientVserionService")
public class ClientVserionServiceImpl implements ClientVserionService {
    @Resource
    ClientVserionMapper vserionClientMapper;
    @Override
    public ClientVserion queryNew(Integer versiontype) {
        return vserionClientMapper.queryNew(versiontype);
    }
}
