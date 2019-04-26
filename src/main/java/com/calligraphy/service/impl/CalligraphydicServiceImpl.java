package com.calligraphy.service.impl;

import com.calligraphy.dao.CalligraphydicMapper;
import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.dto.Dicvideo;
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

    @Override
    public Integer diclistcount(String keyword, Integer type) {
        return calligraphydicMapper.diclistcount(keyword,type);
    }

    @Override
    public List<Dicvideo> dicvideolisy(String keyword, Integer start, Integer end) {
        return calligraphydicMapper.dicvideolist(keyword,start,end);
    }

    @Override
    public Integer dicvideolistcount(String keyword) {
        return calligraphydicMapper.dicvideolistcount(keyword);
    }
}
