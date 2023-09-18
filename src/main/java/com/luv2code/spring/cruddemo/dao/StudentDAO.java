package com.luv2code.spring.cruddemo.dao;

import com.luv2code.spring.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);

    Student findByName(String firstName);

    List findByLastName(String lastname);
    List<Student> findAll();

    void update(Student theStudent);

    void delete(int id);
}
