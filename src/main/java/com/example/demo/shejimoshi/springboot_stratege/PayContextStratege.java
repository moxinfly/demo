package com.example.demo.shejimoshi.springboot_stratege;

import com.example.demo.shejimoshi.springboot_stratege.context.SpringUtils;
import com.example.demo.shejimoshi.springboot_stratege.impl.AliPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayContextStratege {
    public String toPay(String payCode){
        PayStratege bean=null;
        if(payCode.equals("1")){
           bean = SpringUtils.getBean("aliPay", PayStratege.class);
            bean.pay();
        }else{
            bean=SpringUtils.getBean("yinlianPay",PayStratege.class);
        }
        return bean.pay();
    }
}
