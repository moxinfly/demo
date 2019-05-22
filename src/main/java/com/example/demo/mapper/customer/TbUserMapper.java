package com.example.demo.mapper.customer;

import com.example.demo.entity.TbUserEntity;
import com.example.demo.mapper.base.CrudMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserMapper extends CrudMapper<TbUserEntity>{
    //
}
