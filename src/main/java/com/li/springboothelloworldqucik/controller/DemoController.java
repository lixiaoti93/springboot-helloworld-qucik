package com.li.springboothelloworldqucik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${person.username}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello"+name;
    }
}
