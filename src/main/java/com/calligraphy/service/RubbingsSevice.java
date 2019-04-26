package com.calligraphy.service;

import com.calligraphy.dto.Rubbings;

import java.util.List;

public interface RubbingsSevice {

    public List<Rubbings> list(String keyword,Integer rubbingsType,Integer pageSize,Integer pageNum);

    public Integer listcount(String keyword,Integer rubbingsType);

    public List<Rubbings> mycollect(String keyword,String userId,Integer pageSize,Integer pageNum);

    public Integer mycollectcount(String keyword,String userId);

    public void addcollect(String rubbingsId,String userId);

    public void canclecollect(String rubbingsId,String userId);

    public List<Rubbings> hotlist();
}
