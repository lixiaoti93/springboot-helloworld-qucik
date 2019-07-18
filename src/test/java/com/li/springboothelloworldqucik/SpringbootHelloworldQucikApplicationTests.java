package com.li.springboothelloworldqucik;

import com.li.springboothelloworldqucik.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
