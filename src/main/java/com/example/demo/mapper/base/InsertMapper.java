package com.example.demo.mapper.base;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

public interface InsertMapper <T> extends Marker,
        tk.mybatis.mapper.common.base.BaseInsertMapper<T>,
        InsertSelectiveMapper<T>,
        MySqlMapper<T> {

}
