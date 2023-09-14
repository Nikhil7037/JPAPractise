package com.luv2code.spring.cruddemo.dao;

import com.luv2code.spring.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDAO{

    //define field for entity manager

    @Autowired
    private EntityManager entityManager;
    //inject entity manager using constructor injection

    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
       entityManager.persist(theStudent);

    }

    @Override
    public Student findById(Integer id) {
          return entityManager.find(Student.class,id);
    }

    @Override
    public Student findByName(String first_name) {
        return entityManager.find(Student.class,first_name);
    }
}
