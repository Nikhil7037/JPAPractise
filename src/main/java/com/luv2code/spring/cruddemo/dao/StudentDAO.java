package com.luv2code.spring.cruddemo.dao;

import com.luv2code.spring.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);

    Student findByName(String first_name);
}
