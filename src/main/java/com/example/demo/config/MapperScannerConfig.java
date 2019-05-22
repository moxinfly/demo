package com.example.demo.config;

import com.example.demo.mapper.base.CrudMapper ;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;
import java.util.Properties;

@Configuration
public class MapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //mapper类的包名--即操作数据库的对应到数据表的Mapper.java类的包名，如果这里的包名配错项目启动报错
        mapperScannerConfigurer.setBasePackage("com.example.demo.mapper.customer");

        //这里properties的相关配置，由于能力有限，暂时还未探究，如果你知道请麻烦告诉我，谢谢
        Properties properties = new Properties();
        properties.setProperty("mappers", CrudMapper.class.getName());
        properties.setProperty("notEmpty","false");
        properties.setProperty("IDENTITY", "MYSQL");
        properties.setProperty("ORDER","BEFORE");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
