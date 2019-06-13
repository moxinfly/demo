package com.example.demo.mybatis_swagger.controller;

import com.example.demo.mybatis_swagger.Service.UserService;
import com.example.demo.mybatis_swagger.entity.TbUserEntity;
import com.example.demo.mybatis_swagger.entity.UserDto;
import com.example.demo.mybatis_swagger.excel.ExcelExportUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    @GetMapping("/selfSelectById")
    @ResponseBody
    @ApiOperation(value = "查询测试", notes = "查询测试1")
    public TbUserEntity selfSelectById(@RequestParam(value = "id") Integer id){
        return userService.selfSelectById(id);
    }

    @GetMapping("/export")
    public void export(){
        /**
         * Mock数据，Java对象列表
         */
        List<UserDto> shopDTOList = new ArrayList<UserDto>();
        for (int i = 0; i < 100; i++) {
            UserDto shop = new UserDto(1,"1","1");
            shopDTOList.add(shop);
        }
        String filePath = "demo-sheet.xls";
        /**
         * Excel导出：Object 转换为 Excel
         */
        ExcelExportUtil.exportToFile(filePath,shopDTOList);
    }
}
