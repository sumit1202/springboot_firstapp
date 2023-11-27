package com.example.sbgroup.sbdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice football1 daily.";
    }

}
