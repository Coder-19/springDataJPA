package com.springbootProject.restAPI.restController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

// the code below is to create a controller class for the employee rest api using the @RestController annotation

// using the @Scope annotation to make the scope of this class as singleton

@RestController
@Scope("singleton")
public class EmployeeRestController {
    // using the @PostContruct annotation to create a custom init-method below
    @PostConstruct
    public void customInitMethod(){
        // the below line of code is for debugging purpose
        System.out.println("EmployeeRestController: Inside Custom  init-method");
    }

    // using the @PreDestroy annotation below to make a custom destroy method
    @PreDestroy
    public void customDestroyMethod(){
        // the below line of code is for debugging purpose
        System.out.println()
    }
}
