package com.example.sbgroup.sbdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello")
    public String helloPrinter() {
        return "Hello Spring Boot Application";
    }
}
