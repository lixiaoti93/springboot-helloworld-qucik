package com.li.springboothelloworldqucik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:beans.xml ")//加载配置文件
@SpringBootApplication
public class  SpringbootHelloworldQucikApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldQucikApplication.class, args);
    }

}
