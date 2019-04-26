package com.calligraphy.dao;

import com.calligraphy.dto.ClientVserion;
import org.apache.ibatis.annotations.Param;

public interface ClientVserionMapper {
    public ClientVserion queryNew(@Param("versiontype")Integer versiontype);
}
