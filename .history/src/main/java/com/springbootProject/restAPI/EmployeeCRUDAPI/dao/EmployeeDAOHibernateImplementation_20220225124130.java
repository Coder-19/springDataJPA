package com.springbootProject.restAPI.EmployeeCRUDAPI.dao;

import java.util.List;

import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;

// the code below is used to create a class for writing the functionality for doing the transactions with the
// employee mysql database

// the code below is to use the EmployeeDaoInterface for overriding the methods for doing the CRUD operations with
// the employee database
public class EmployeeDAOHibernateImplementation implements EmployeeInterfaceDAO{


    // the code below is used to override the method for getting the list of all the employees from the database
    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return null;
    }
    
}
