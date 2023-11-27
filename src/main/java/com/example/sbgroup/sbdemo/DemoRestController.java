package com.example.sbgroup.sbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    @Autowired
    DemoRestController(Coach thisCoach) {
        myCoach=thisCoach;
    }

    @GetMapping("/coaching")
    public String FunCoachController() {
        return myCoach.getDailyWorkout();
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teamInfoPrinter() {
        return "Coach Name: "+coachName+", Team Name: "+teamName+".";
    }

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
