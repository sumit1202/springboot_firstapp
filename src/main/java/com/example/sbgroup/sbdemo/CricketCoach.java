package com.example.sbgroup.sbdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling daily.";
    }

}
