package com.springbootProject.restAPI.EmployeeCRUDAPI.service;

import java.util.List;

import com.springbootProject.restAPI.EmployeeCRUDAPI.dao.EmployeeInterfaceDAO;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

// the code below is used to create a class for writing the functionality for the service layer
// for doing the CRUD transactions with the mysql database

// the code below is to use the @Service annotation for making the class below as a service class
@Service
public class EmployeeServiceImplementation implements EmployeeServiceInterface {

    // the code below is used to create an instance of the EmployeeInterfaceDao for dependency Injection
    private EmployeeInterfaceDAO employeeInterfaceDAO;

    // the code below is used to create a constructor for doing constructor injection for getting access 
    // to all the employee interface Dao methods for doing transactions with the database for doing the 
    // CRUD operations

    // using the @Autowired annotation for letting the spring to 
    public EmployeeServiceImplementation(EmployeeInterfaceDAO theEmployeeInterfaceDAO){
        this.employeeInterfaceDAO = theEmployeeInterfaceDAO;
    }

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
