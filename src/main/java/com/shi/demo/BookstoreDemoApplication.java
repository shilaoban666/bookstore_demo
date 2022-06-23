package com.shi.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.shi.demo.dao")
public class BookstoreDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreDemoApplication.class, args);
    }

}
