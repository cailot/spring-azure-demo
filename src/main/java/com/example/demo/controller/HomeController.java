package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/message")
    public String message() {
        return "Hello ! My name is Jinhyung Seo from Azure !!!";
    }
}
