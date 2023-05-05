package com.hypnos.springboot3hello.controller;

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
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hi")
    public String handle01(){
        return "hello01";
    }
}
