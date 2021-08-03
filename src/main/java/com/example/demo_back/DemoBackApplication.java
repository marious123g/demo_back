package com.example.demo_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com/example/demo_back/mapper"})
public class DemoBackApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DemoBackApplication.class, args);
    }

}
