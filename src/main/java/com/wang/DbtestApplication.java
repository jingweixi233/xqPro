package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.repository")
public class DbtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbtestApplication.class, args);
    }

}
