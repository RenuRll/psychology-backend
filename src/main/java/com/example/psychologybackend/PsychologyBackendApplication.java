package com.example.psychologybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.psychologybackend.mapper")
public class PsychologyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsychologyBackendApplication.class, args);
    }

}
