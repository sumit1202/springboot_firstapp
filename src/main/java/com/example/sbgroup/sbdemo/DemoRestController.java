package com.example.sbgroup.sbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@RestController
public class DemoRestController {

    @PostConstruct
    public void initizeStuff(){
        System.out.println("Initization Stuff being done.");
    }

    private Coach myCoach;

    @Autowired
    DemoRestController(@Qualifier("cricketCoach") Coach fCoach) {
        myCoach = fCoach;
    }

    @GetMapping("/coaching")
    public String FunCheck() {
        return myCoach.getDailyWorkout();
    }

    @PreDestroy
    public void destroyStuff(){
        System.out.println("Destruction Stuff being done.");
    }

}
