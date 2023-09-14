package com.luv2code.spring.cruddemo.rest;

import com.luv2code.spring.cruddemo.dao.EmployeeDAO;
import com.luv2code.spring.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeDAO employeeDAO;



    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }
    //quick and dirty:inject employee Dao directly

    // expose "//employee" and return a list of employees
}
