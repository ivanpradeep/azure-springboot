package com.example.sample.samplewebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
    @GetMapping("/")
    public String getRoot(){
        return "Spring Boot web: Hello World! Updated";
    }
}
