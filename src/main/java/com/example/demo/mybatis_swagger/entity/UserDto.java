package com.example.demo.mybatis_swagger.entity;


import com.example.demo.mybatis_swagger.excel.annotation.ExcelField;
import com.example.demo.mybatis_swagger.excel.annotation.ExcelSheet;
import org.apache.poi.hssf.util.HSSFColor;


@ExcelSheet(name = "用户列表", headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN)
public class UserDto {
    @ExcelField(name="id")
    private Integer id;
    @ExcelField(name="用户名")
    private String userName;
    @ExcelField(name="密码")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
