package com.calligraphy.service.impl;

import com.calligraphy.dao.CalligraphydicMapper;
import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.service.CalligraphydicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CalligraphydicService")
public class CalligraphydicServiceImpl implements CalligraphydicService {
    @Resource
    CalligraphydicMapper calligraphydicMapper;
    @Override
    public List<Calligraphydic> diclist(String keyword,Integer type,Integer start,Integer end) {
        return calligraphydicMapper.diclist(keyword,type,start,end);
    }
}
