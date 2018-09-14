package com.financial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.financial.mapper")
public class FinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialApplication.class, args);
    }
}
