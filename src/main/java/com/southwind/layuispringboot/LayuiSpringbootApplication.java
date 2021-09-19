package com.southwind.layuispringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.southwind.layuispringboot.mapper")
public class LayuiSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuiSpringbootApplication.class, args);
    }

}
