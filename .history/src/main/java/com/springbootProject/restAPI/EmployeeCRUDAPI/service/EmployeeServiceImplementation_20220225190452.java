package com.springbootProject.restAPI.EmployeeCRUDAPI.service;

import java.util.List;
import com.springbootProject.restAPI.EmployeeCRUDAPI.dao.EmployeeInterfaceDAO;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    // using the @Autowired annotation for letting the spring to know that the constructor below 
    // is to be used for dependency injection using constructor injection for getting the methods
    // for doing the transactions with the mysql database for doing the crud operations

    // the code below is to use the @Qualifier() annotation and passing the bean id for letting the 
    // spring know that we are looking for the following bean for doing dependency injection

    @Autowired
    public EmployeeServiceImplementation(@Qualifier("employeeDAOHibernateImplementation") EmployeeInterfaceDAO theEmployeeInterfaceDAO){
        this.employeeInterfaceDAO = theEmployeeInterfaceDAO;
    }

    // using the @Transactional annotation for managing the starting and commiting etc of all the transactions with 
    // the mysql database

    @Override
    @Transactional
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
