package com.example.demo.mapper.base;


public interface CrudMapper <T> extends InsertMapper<T>,  DeleteMapper<T>, SelectMapper<T>,
        UpdateMapper<T>{

}
