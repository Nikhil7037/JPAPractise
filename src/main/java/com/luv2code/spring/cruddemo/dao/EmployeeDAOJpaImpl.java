package com.luv2code.spring.cruddemo.dao;

import com.luv2code.spring.cruddemo.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {


    //define field for entitymanager
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager)
    {
        entityManager=theEntityManager;
    }
    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee", Employee.class);

        //execute the query and get result list
        List<Employee> employees=theQuery.getResultList();

        //return the results
        return employees;
    }
}
