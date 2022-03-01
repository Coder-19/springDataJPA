package com.springbootProject.restAPI.EmployeeCRUDAPI.service;

import java.util.List;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

// the code below is used to create a class for writing the functionality for the service layer
// for doing the CRUD transactions with the mysql database

// the code below is to use the @Service annotation for making the class below as a service class
@Service
public class EmployeeServiceImplementation implements EmployeeServiceInterface {

    // the code below is used to create an instance of the EmployeeInterfaceDao 
    

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return null;
    }

    @Override
    public EmployeeEntity getEmployeeById(int empId) {
        return null;
    }

    @Override
    public void saveEmployee(EmployeeEntity employeeEntity) {
        
    }

    @Override
    public void deleteEmployee(int empId) {
        
    }
    
}
