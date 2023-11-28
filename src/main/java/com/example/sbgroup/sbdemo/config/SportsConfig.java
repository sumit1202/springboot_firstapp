package com.example.sbgroup.sbdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.sbgroup.sbdemo.Coach;
import com.example.sbgroup.sbdemo.SwimCoach;

@Configuration
public class SportsConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
