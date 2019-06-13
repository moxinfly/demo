package com.example.demo.mybatis_swagger.mapper.base;


public interface CrudMapper <T> extends InsertMapper<T>,  DeleteMapper<T>, SelectMapper<T>,
        UpdateMapper<T>{

}
