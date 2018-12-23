package com.calligraphy.service.impl;

import com.calligraphy.dao.RubbingsMapper;
import com.calligraphy.dto.Rubbings;
import com.calligraphy.service.RubbingsSevice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("RubbingsSevice")
public class RubbingsSeviceImpl implements RubbingsSevice {
    @Resource
    RubbingsMapper rubbingsMapper;

    @Override
    public List<Rubbings> list(String keyword, Integer rubbingsType,Integer pageSize,Integer pageNum) {
        return rubbingsMapper.list(keyword,rubbingsType,(pageNum-1)*pageSize,pageNum*pageSize);
    }

    @Override
    public List<Rubbings> mycollect(String keyword, String userId,Integer pageSize,Integer pageNum) {
        return rubbingsMapper.mycollect(keyword,userId,(pageNum-1)*pageSize,pageNum*pageSize);
    }

    @Override
    public void addcollect(String rubbingsId, String userId) {
        rubbingsMapper.addcollect(rubbingsId,userId);
    }
}
