package com.luv2code.spring.cruddemo.dao;

import com.luv2code.spring.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public Student findByName(String firstName) {
        return entityManager.find(Student.class,firstName);
    }

    @Override
    public List<Student> findByLastName(String lastname) {
        //create query
        TypedQuery<Student> theQuery=entityManager.createQuery("From Student where lastName=:theData",Student.class);

        theQuery.setParameter("theData",lastname);
        //set query parameters
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findAll() {
        //create query
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student order by lastName asc", Student.class);


        //return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(int id) {
     //retrieve the student
     Student thestudent=entityManager.find(Student.class,id);

    //delete the student
        entityManager.remove(thestudent);
    }
}
