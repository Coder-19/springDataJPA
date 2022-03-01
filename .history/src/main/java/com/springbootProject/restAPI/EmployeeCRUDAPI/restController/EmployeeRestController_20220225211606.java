package com.springbootProject.restAPI.EmployeeCRUDAPI.restController;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
// import com.springbootProject.restAPI.EmployeeCRUDAPI.dao.EmployeeInterfaceDAO;
import com.springbootProject.restAPI.EmployeeCRUDAPI.entity.EmployeeEntity;
import com.springbootProject.restAPI.EmployeeCRUDAPI.service.EmployeeServiceImplementation;
import com.springbootProject.restAPI.EmployeeCRUDAPI.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// the code below is to create a controller class for the employee rest api using the @RestController annotation

// using the @Scope annotation to make the scope of this class as singleton

// using the @RequestMapping annotation to create a Class level mapping for the code below

@RestController
@Scope("singleton")
@RequestMapping("/api")
public class EmployeeRestController {

    // the code below is used to create an instance of the EmployeeInterfaceDao interface
    // private EmployeeInterfaceDAO employeeInterfaceDAO;

    // the code below is used to create an instance of the employeeService interface for 
    // doing dependency injection for getting access to the functions for doing transactions with 
    // the database
    private EmployeeServiceInterface employeeServiceInterface;

    // using the @PostContruct annotation to create a custom init-method below
    @PostConstruct
    public void customInitMethod(){
        // the below line of code is for debugging purpose
        System.out.println("EmployeeRestController: Inside Custom  init-method");
    }

    // the code below is to create a contructor and pass the instance of the employeeInterfaceDao as input and
    // use the @Autowired annotation to do constructor injection

    // using the @Qualifier annotation and passing the name of the dependency / helper class for doing dependency
    // injection
    // @Autowired
    // public EmployeeRestController(@Qualifier("employeeDAOHibernateImplementation") EmployeeInterfaceDAO theEmployeeInterfaceDAO){
    //     this.employeeInterfaceDAO = theEmployeeInterfaceDAO;
    // }



    // the code below is to create a contructor and pass the instance of the employeeInterfaceDao as input and
    // use the @Autowired annotation to do constructor injection

    // using the @Qualifier annotation and passing the name of the dependency / helper class for doing dependency
    // injection
    @Autowired
    public EmployeeRestController(@Qualifier("employeeServiceImplementation") EmployeeServiceImplementation theEmployeeServiceImplementation){
        this.employeeServiceInterface = theEmployeeServiceImplementation;
    }

    // @GetMapping("/test")
    // public String testApi(){
    //     return "test successfull";
    // }

    // the code below is to use the @GetMapping annotation to create a controller method for the rest api to 
    // show the list of all the employees to the user when the user goes to the /employees path
    @GetMapping("/employees")
    public List<EmployeeEntity> getListOfAllEmployees(){
        // the code below is used to return the list of all the employees by calling the findAllEmployees()
        // method from the employee interface dao
        // return employeeInterfaceDAO.findAllEmployees();


        // the code below is used to return the list of all the employees by calling the findAllEmployees()
        // method from the employee interface dao
        return employeeServiceInterface.findAllEmployees();
    }


    // the code below is to use the @GetMapping annotation for creating a rest controller api method for
    // getting the id of the employee as input and returning the details of the employee if the id of
    // employee exists in the database

    // the @GetMapping annotation takes the id of the employee as input for checking the database that if
    // the id exists then returning the details of the employee else throwing error

    // the code below is to use the @PathVariable annotation so as to get the value of the employeeId
    // and bind it or pass it to the employee id that we pass as input to the method below

    @GetMapping("/employee/{employeeId}")
    public EmployeeEntity getEmployeeDetails(@PathVariable int employeeId){
        // the code below is to use the getEmployeeById method and passing the employee id that we 
        // get as input from the api for getting the employee details based on the id
        EmployeeEntity employee = employeeServiceInterface.getEmployeeById(employeeId);

        // the code below is used to check that if the value of the employee is null then throwing an
        // error else returning the data inside the employee
        if(employee == null){
            throw new RuntimeException("Employee with id "+employeeId+" not found");
        } else {
            return employee;
        }
    }


        // the code below is to use the @PostMapping annotation and passing the path employees as input so
    // as to create a method that will take the json data as input and then save that data to the mysql 
    // database

    // the code below is to use the @RequestBody annotation for getting the data that we need to save to 
    // the database

    // NOTE: The method below takes the raw json data as input for saving the data to the database
    @PostMapping("/addEmployee")
    public EmployeeEntity addOrUpdateEmployeeInDatabase(@RequestBody EmployeeEntity theEmployeeEntity){
        // the code below is used to set the id of the data entered by the user to 0 just in case
        // the user enters an id with the data so as to create a new data item rather than just updating the
        // item
        theEmployeeEntity.setId(0);

        // the code below is to use the save method and pass the employeeEntity instance as input for saving the 
        // the data to the database
        employeeServiceInterface.saveEmployee(theEmployeeEntity);

        // the code below is used to return the instance of the employee entity
        return theEmployeeEntity;
    }


    // the code below is to use the @PutMapping annotation for getting the data of the employee and 
    // updating that data in the data base

    // the code below is to use the @RequestBody annotation for getting the data that we need to save to 
    // the database

    // NOTE: The method below takes the raw json data as input for saving the data to the database
    @PutMapping("/updateEmployee")
    public EmployeeEntity updateEmployeeData(@RequestBody EmployeeEntity theEmployeeEntity){
        // the code below is to use the save method and pass the employeeEntity instance as input for updating the 
        // the data to the database
        employeeServiceInterface.saveEmployee(theEmployeeEntity);

        // the code below is used to return the instance of the employee entity
        return theEmployeeEntity;
    }

    
    // the code below is to use the @DeleteMapping annotation and create a method for deleting the employee based on the id that 
    // we have passed as input to the api 

    // the code below is to use the @PathVariable annotation so as to get the value of the employeeId
    // and bind it or pass it to the employee id that we pass as input to the method below

    @DeleteMapping("/deleteEmployee/{empId}")
    public String deleteEmployee(@PathVariable int empId){
        // the code below is to use the findById method for getting the employee based on the id entered by 
        // the user
        EmployeeEntity employeeEntity = employeeServiceInterface.getEmployeeById(empId);

        // the code below is used to check that if the data inside the employeeEntity instance is null
        // then throwing a runtime exception else using the delete method and passing the employee id 
        // as input to delete the employee
        if(employeeEntity == null){
            throw new RuntimeException("Employee with id "+empId+" not found");
        } else {
            employeeServiceInterface.deleteEmployee(empId);

            return "Employee at "+empId+" deleted successfully";
        }
    }


    // using the @PreDestroy annotation below to make a custom destroy method
    @PreDestroy
    public void customDestroyMethod(){
        // the below line of code is for debugging purpose
        System.out.println("EmployeeRestController: Inside Custom Destroy method");
    }

}
