package com.springbootProject.restAPI.EmployeeCRUDAPI.service;

import java.util.List;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;

// the code below is used to create an interface for creating the signature of the methods for 
// acting as a service for doing transactions with the mysql database for doing CRUD operations
public interface EmployeeServiceInterface {
    // the code below is used to create a method for getting the list of all the employees from the database
    public List<EmployeeEntity> findAllEmployees();

    // the code below is used to create a signature of the method to get the details of an employee by id
    public EmployeeEntity getEmployeeById(int empId);
 
    // the code below is used to create a signatue of the method for adding an employee to the database
    public void saveEmployee(EmployeeEntity employeeEntity);
 
    // the code is used to create a signature of the method to delete an employee by id
    public void deleteEmployee(int empId);   
}
