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


    // the code below is used to override the signature of the method for getting the list of all the
    // employees

    // using the @Transactional annotation for managing the starting and commiting etc of all the transactions with 
    // the mysql database

    @Override
    @Transactional
    public List<EmployeeEntity> findAllEmployees() {
        // the code below is to use the findAllEmployees() method from the employee interface Dao
        // for gettingthe details of all the employees
        return employeeInterfaceDAO.findAllEmployees();
    }


    // the code below is used to override the signature of the method for getting the details of 
    // employee based on the id 

    // using the @Transactional annotation for managing the starting and commiting etc of all the transactions with 
    // the mysql database

    @Override
    @Transactional
    public EmployeeEntity getEmployeeById(int empId) {
        // the code below is to use the getEmployeeById() and passing the employee id as input for 
        // getting the details of the employee based on the id of the employee 
        return employeeInterfaceDAO.getEmployeeById(empId);
    }

    // the code below is used to override the signature of the method for saving or updating the 
    // employee to the database

    // using the @Transactional annotation for managing the starting and commiting etc of all the transactions with 
    // the mysql database

    @Override
    @Transactional
    public void saveEmployee(EmployeeEntity employeeEntity) {
        // the code below is to use the saveEmployee() method and passing the instance of the employee
        // entity class for saving or updating the details of the employee to the mysql database
        employeeInterfaceDAO.saveEmployee(employeeEntity);
    }

    // the code below is used to create the signature of the method for deleting the datails of the 
    // employee based on the id of the employee

    // using the @Transactional annotation for managing the starting and commiting etc of all the transactions with 
    // the mysql database
    
    @Override
    @Transactional
    public void deleteEmployee(int empId) {
        // the code below is to use the deleteEmployee() method and passing the id of hte employee
        // for deleting the employee based on the id of the employee
        employeeInterfaceDAO.deleteEmployee(empId);
    }
    
}
