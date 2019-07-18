package com.li.springboothelloworldqucik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个类返回的数据全部返回给浏览器，（如果是对象转换成JSON类型）
 */
//@ResponseBody
///@Controller
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hell() {
        return "hello world quick";
    }
}
