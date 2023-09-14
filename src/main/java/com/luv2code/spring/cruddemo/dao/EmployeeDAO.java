package com.luv2code.spring.cruddemo.dao;

import com.luv2code.spring.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
