package com.example.sbgroup.sbdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 6 hours daily.";
    }
    
}
