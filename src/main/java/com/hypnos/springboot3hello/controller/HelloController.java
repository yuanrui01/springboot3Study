package com.hypnos.springboot3hello.controller;

import com.hypnos.springboot3hello.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/4-1:36
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;


    @RequestMapping("/hi")
    public Person handle01(){

        return person;
    }
}
