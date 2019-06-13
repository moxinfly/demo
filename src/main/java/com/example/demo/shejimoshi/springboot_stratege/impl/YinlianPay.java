package com.example.demo.shejimoshi.springboot_stratege.impl;

import com.example.demo.shejimoshi.springboot_stratege.PayStratege;
import org.springframework.stereotype.Component;

@Component
public class YinlianPay implements PayStratege {
    @Override
    public String pay() {
        return "this is a yinlian pay";
    }
}
