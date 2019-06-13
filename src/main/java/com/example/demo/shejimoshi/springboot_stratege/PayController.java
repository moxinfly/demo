package com.example.demo.shejimoshi.springboot_stratege;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @Autowired
    private PayContextStratege payContextStratege;
    @RequestMapping("/toPay")
    public String toPay(){
        return payContextStratege.toPay("1");
    }
}
