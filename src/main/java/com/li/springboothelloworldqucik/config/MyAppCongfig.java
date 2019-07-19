package com.li.springboothelloworldqucik.config;

import com.li.springboothelloworldqucik.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类属于配置类，来替换spring配置文件
 */
@Configuration
public class MyAppCongfig {
    //将方法的返回值放置到容器中，容器中这个组件默认的值就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("容器中添加组件了");
        return new HelloService();
    }
}
