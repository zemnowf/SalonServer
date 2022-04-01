package com.zemno.serverapplication.salonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalonServerApplication.class, args);
        System.out.println("Server stared.\n Port: 8085");
    }

}
