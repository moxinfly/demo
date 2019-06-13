package com.example.demo.mybatis_swagger.mapper.customer;

import com.example.demo.mybatis_swagger.entity.TbUserEntity;
import com.example.demo.mybatis_swagger.mapper.base.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbUserMapper extends CrudMapper<TbUserEntity> {
    //写自定义mapper中的方法
    TbUserEntity selfSelectById(@Param("id")Integer id);
}
