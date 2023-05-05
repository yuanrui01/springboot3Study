package com.hypnos.springboot3hello;

import com.hypnos.springboot3hello.bean.User01;
import com.hypnos.springboot3hello.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot3HelloApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot3HelloApplication.class, args);

/*
        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
*/

        User01 user01 = run.getBean(User01.class);

        MyConfig myConfig = run.getBean(MyConfig.class);

        User01 user011 = myConfig.user01();
        User01 user012 = myConfig.user01();

        System.out.println(user011 == user01);

        System.out.println(user011 == user012);

    }

}
