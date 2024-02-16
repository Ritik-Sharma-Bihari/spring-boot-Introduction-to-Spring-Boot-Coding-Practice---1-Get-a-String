package com.example.getstring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

    // Welcome to Spring Boot
    @GetMapping("/")
    public String normalMethod() {
        return "Welcome to Spring Boot";
    }

}