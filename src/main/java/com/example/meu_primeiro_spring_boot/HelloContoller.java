package com.example.meu_primeiro_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class HelloContoller {
    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }
    
}
