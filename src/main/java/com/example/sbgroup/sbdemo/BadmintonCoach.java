package com.example.sbgroup.sbdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BadmintonCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice badminton daily.";
    }
    
}
