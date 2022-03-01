package com.springbootProject.restAPI.EmployeeCRUDAPI.dao;

import java.util.List;

import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;

// the code below is used to create an interface for the employee class
public interface EmployeeInterfaceDAO {
    
    // the code below is used to create a method for getting the list of all the employees from the database
    public List<EmployeeEntity> findAllEmployees();
}
