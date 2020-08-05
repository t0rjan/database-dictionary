package com.trh.dictionary;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@SpringBootApplication
public class DataBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataBaseApplication.class, args);
//        new SpringApplicationBuilder().sources(DataBaseApplication.class).run(args);
    }
}
