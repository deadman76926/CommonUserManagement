package com.fet.um.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "<h1>Hello Thymeleaf</h1>");
        return "hello";
    }

}
