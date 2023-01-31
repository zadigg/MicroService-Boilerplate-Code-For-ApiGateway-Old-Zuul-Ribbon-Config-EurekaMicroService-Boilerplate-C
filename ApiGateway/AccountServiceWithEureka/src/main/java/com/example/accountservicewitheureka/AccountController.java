package com.example.accountservicewitheureka;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping("/account/{customerId}")
    public Account getName(@PathVariable String customerId) {
        return new Account("123456789", "1000");
    }

}
