package com.clara.projeto.atividade_springnoot_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.clara.projeto")
public class AtividadeSpringnootDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(AtividadeSpringnootDataApplication.class, args);
    }
}


