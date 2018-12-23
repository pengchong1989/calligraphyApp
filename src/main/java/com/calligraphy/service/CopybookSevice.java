package com.calligraphy.service;

import com.calligraphy.dto.Copybook;

import java.util.List;

public interface CopybookSevice {
    public List<Copybook> myCopybook(String userId,Integer pageSize,Integer pageNum);

    public void addCopybook(Copybook copybook);
}
