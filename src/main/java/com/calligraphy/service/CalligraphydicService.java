package com.calligraphy.service;

import com.calligraphy.dto.Calligraphydic;

import java.util.List;

public interface CalligraphydicService {
    public List<Calligraphydic> diclist(String keyword,Integer type,Integer start,Integer end);
}
