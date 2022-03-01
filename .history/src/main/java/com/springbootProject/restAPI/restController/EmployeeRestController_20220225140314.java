package com.springbootProject.restAPI.restController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.springbootProject.restAPI.EmployeeCRUDAPI.dao.EmployeeInterfaceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
    private EmployeeInterfaceDAO employeeInterfaceDAO;

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
    @Autowired
    public EmployeeRestController(@Qualifier("EmployeeDAOHibernateImplementation") EmployeeInterfaceDAO theEmployeeInterfaceDAO){
        this.employeeInterfaceDAO = theEmployeeInterfaceDAO;
    }

    // the code below is to use the @GetMapping annotation to create a controller method for the rest api to 
    // show the list of all the employees to the user when the user goes to the /employees path
    public List<>

    // using the @PreDestroy annotation below to make a custom destroy method
    @PreDestroy
    public void customDestroyMethod(){
        // the below line of code is for debugging purpose
        System.out.println("EmployeeRestController: Inside Custom Destroy method");
    }

}
