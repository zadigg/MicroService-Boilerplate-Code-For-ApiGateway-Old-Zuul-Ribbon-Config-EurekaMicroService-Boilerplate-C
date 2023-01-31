package com.example.accountservicewitheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceWithEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceWithEurekaApplication.class, args);
    }

}
