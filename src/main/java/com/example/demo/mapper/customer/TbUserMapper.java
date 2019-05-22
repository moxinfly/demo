package com.example.demo.mapper.customer;

import com.example.demo.entity.TbUserEntity;
import com.example.demo.mapper.base.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbUserMapper extends CrudMapper<TbUserEntity> {
    //写自定义mapper中的方法
    TbUserEntity selfSelectById(@Param("id")Integer id);
}
