package com.luv2code.spring.cruddemo.rest;

import com.luv2code.spring.cruddemo.common.Coach;
import com.luv2code.spring.cruddemo.common.CricketCoach;
import com.luv2code.spring.cruddemo.dao.StudentDAO;
import com.luv2code.spring.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Autowired
  Coach myCoach;

    @GetMapping("/daily")
    public String getDailyWorkout()
    {
       return myCoach.getDailyWorkout();
    }



}
