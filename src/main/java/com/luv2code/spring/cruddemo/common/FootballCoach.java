package com.luv2code.spring.cruddemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public FootballCoach()
    {
        System.out.println("In constructor of "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "FootballCoach here";
    }
}
