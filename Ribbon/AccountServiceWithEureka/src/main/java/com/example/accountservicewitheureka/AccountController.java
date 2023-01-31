package com.example.accountservicewitheureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/account")
    public String getName() {

        return "App is running & service port : " + port;
    }

}
