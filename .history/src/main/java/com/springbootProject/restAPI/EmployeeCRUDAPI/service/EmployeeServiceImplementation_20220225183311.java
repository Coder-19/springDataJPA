package com.springbootProject.restAPI.EmployeeCRUDAPI.service;

import java.util.List;

import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;

// the code below is used to create a class for writing the functionality for the service layer
// for doing the CRUD transactions with the mysql database

public class EmployeeServiceImplementation implements EmployeeServiceInterface {

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EmployeeEntity getEmployeeById(int empId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveEmployee(EmployeeEntity employeeEntity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteEmployee(int empId) {
        // TODO Auto-generated method stub
        
    }
    
}