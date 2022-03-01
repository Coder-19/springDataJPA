package com.springbootProject.restAPI.EmployeeCRUDAPI.dao;

import java.util.List;
import javax.persistence.EntityManager;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// the code below is used to create a class for writing the functionality for doing the transactions with the
// employee mysql database

// the code below is to use the EmployeeDaoInterface for overriding the methods for doing the CRUD operations with
// the employee database

// the code below is to use the @Repository annotation for indicating that the class below provides the mechanism 
// for all the CRUD functionalities with the mysql database

@Repository
public class EmployeeDAOHibernateImplementation implements EmployeeInterfaceDAO {

    // the code below is used to create an instance of the entityManager for doing the CRUD operations with the 
    // entities
    private EntityManager entityManager;

    // the code below is to create a constructor for doing the constructor injection for the entityManager

    // using the @AutoWired annotation for doing the constructor injection
    @Autowired
    public EmployeeDAOHibernateImplementation(EntityManager eManager){
        this.entityManager = eManager;
    }

    // the code below is used to override the method for getting the list of all the
    // employees from the database

    // using the @Transactional annotation for managing the starting and commiting etc of all the transactions with 
    // the mysql database

    @Override
    @Transactional
    public List<EmployeeEntity> findAllEmployees() {
        // the code below is used to get the current hibernate session using the unrap() method from the entity
        // manager instance and passing the session class as input and saving the result in a session object    
        Session currentSession = entityManager.unwrap(Session.class);
        
        // the code below is used to create a query for getting the list of all the employees from the database 
        Query<EmployeeEntity> query = currentSession.createQuery("from EmployeeEntity", EmployeeEntity.class);

        // the code below is used to get the list of the employees
        List<EmployeeEntity> employeeList = query.getResultList();

        // // the below line of code is for debugging purpose
        // System.out.println("Employee List: "+employeeList);

        // the code below is used to return the list of the employee
        return employeeList;
    }

    // the code below is used to override the signature of the method to get the details of the employee by id
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
