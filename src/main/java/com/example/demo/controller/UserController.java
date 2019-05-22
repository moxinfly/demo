package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.TbUserEntity;
import com.example.demo.mapper.customer.TbUserMapper;
import org.apache.ibatis.transaction.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/insert")
    public void insert(){

        userService.insert();
    }

    @GetMapping("/update")
    public void update(){

        userService.update();
    }

    @GetMapping("/query")
    public  List<TbUserEntity> query(){
        List<TbUserEntity> list = userService.selectAll();
        return list;
    }
    @GetMapping("/test")
    public void test(){
        userService.test();
    }
}
