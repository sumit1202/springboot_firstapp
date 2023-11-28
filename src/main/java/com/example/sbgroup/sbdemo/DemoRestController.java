package com.example.sbgroup.sbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    // @Autowired
    // DemoRestController(@Qualifier("swimCoach") Coach sCoach) {
    //     myCoach = sCoach;
    // }

    @Autowired
    DemoRestController(@Qualifier("aquatic") Coach sCoach) {
        myCoach = sCoach;
    }

    @GetMapping("/coaching")
    public String FunCheck() {
        return myCoach.getDailyWorkout();
    }

}
