package com.li.springboothelloworldqucik;

import com.li.springboothelloworldqucik.bean.Person;
import com.li.springboothelloworldqucik.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot测试类：
 * 测试期间可以方便的类似编码一样进行自动注入
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloworldQucikApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;
    @Test
    public void testHelloService(){
        boolean bl =ioc.containsBean("helloService");
        System.out.println(bl);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
