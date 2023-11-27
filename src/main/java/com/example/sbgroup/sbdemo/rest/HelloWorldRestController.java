package com.example.sbgroup.sbdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello")
    public String helloPrinter() {
        return "Hello Spring Boot Application";
    }

    @GetMapping("/bye")
    public String byePrinter() {
        return "Bye Spring Boot Application";
    }

    @GetMapping("/cheers")
    public String cheersPrinter() {
        return "Cheers Spring Boot Application";
    }

}
