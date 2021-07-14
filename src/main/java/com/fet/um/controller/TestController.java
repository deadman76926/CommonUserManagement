package com.fet.um.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String TestThymeleaf(Model model) {
        model.addAttribute("msg", "Hello,Thymeleaf");
        return "test";
    }
    
}
