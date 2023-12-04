package com.example.order66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Order66Application {

    public static void main(String[] args) {
        SpringApplication.run(Order66Application.class, args);
        Future.future();
    }

}
