package com.hypnos.springboot3hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/5/6-21:40
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String gotoPage(){
        return "forward:success";
    }

    @ResponseBody
    @GetMapping("/success")
    public String success(){
        return "win";
    }
}
