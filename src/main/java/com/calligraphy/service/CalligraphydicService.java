package com.calligraphy.service;

import com.calligraphy.dto.Calligraphydic;
import com.calligraphy.dto.Dicvideo;

import java.util.List;

public interface CalligraphydicService {
    public List<Calligraphydic> diclist(String keyword,Integer type,Integer start,Integer end);
    public Integer diclistcount(String keyword,Integer type);
    public List<Dicvideo> dicvideolisy(String keyword,Integer start,Integer end);
    public Integer dicvideolistcount(String keyword);

}
