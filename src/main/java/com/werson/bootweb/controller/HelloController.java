package com.werson.bootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class HelloController {

    @GetMapping(value = "/index")
    public String index(@RequestParam Integer a) {
        System.out.println("index------");
        return "index";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/version2")
    public String version2(){
        System.out.println("this is version2");
        return "version2";
    }

}
