package com.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.tasks.mapper.customer"})
@SpringBootApplication
@EnableTransactionManagement
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
    }
}
