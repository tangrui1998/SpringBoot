package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @ResponseBody
    @RequestMapping(value = "/test1")
    public String test1(){
        System.out.println("11111111");
        return "第3次测试";
    }
}
