package com.springbootProject.restAPI.EmployeeCRUDAPI.dao;

import java.util.List;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;

// the code below is used to create an interface for the employee class to contain the signature of the methods
// for doing the transaction with the employee database
public interface EmployeeInterfaceDAO {
    
    // the code below is used to create a method for getting the list of all the employees from the database
    public List<EmployeeEntity> findAllEmployees();

    // the code below is used to create a signature of the method to get the details of an employee by id
    public EmployeeEntity getEmployeeById(int empId);

    // the code below is used to create a signatue of the method for adding an employee to the database
    public void saveEmployee(EmployeeEntity employeeEntity);

    // the code is used to create a signature of the method to delete an employee by id
    public void deleteEmployee(int empId);
}
