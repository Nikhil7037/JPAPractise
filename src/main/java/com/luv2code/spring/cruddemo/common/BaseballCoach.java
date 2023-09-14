package com.luv2code.spring.cruddemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements  Coach{

    public BaseballCoach()
    {
        System.out.println("In constructor of "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Baseball Coach ";
    }
}
