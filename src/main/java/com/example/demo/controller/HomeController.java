package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/message")
    public String message() {
        return "Congrats ! Jinhyung Seo's app deployed successfully in Azure !!!";
    }
}
