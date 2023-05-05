package com.hypnos.springboot3hello.config;

import com.hypnos.springboot3hello.bean.User01;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/4-22:05
 */
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean
    public User01 user01(){
        return new User01();
    }
}
