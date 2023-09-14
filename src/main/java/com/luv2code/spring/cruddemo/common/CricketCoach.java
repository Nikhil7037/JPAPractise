package com.luv2code.spring.cruddemo.common;

import com.luv2code.spring.cruddemo.common.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach()
    {
        System.out.println("In constructor of "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "CricketCoach here";
    }
}
