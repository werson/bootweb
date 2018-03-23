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
        return "hello";
    }

}
