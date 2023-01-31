package com.example.customerservicewitheureka;

import com.example.customerservicewitheureka.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate template;
    @RequestMapping("/account")
    public String getName() {
        return template.getForObject("http://ACCOUNTSERVICE/account", String.class); }

}
