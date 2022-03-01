package com.springbootProject.restAPI.EmployeeCRUDAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// the code below is used to create a class for acting as an entity for the employees using the @Entity annotation

// using the @Table annotation and passing the name of the table as input for mapping the entity class below
// to the specific database table

// the class below maps to the employee mysql database table

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    
    // the code below is used to create a property for getting the id of the user

    // using the @Id annotation to make this field as a primary key and apply auto increment

    // using the @GeneratedValue annotation and passing the GenerationStrategy as Identity for 
    // auto incrementing the values in the database
    
    // the code below is to use the @Column annotation and passing the name of the column to which we want to 
    // map the value of the property below

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    // the code below is used to create a property for getting the first name of the user

    // using the @Column annotation and passing the name of the column to which we want to map the property
    // below

    @Column(name = "first_name")
    private String employeeFirstName;

    // the code below is used to create a property for getting the last name of the employee

    // using the @Column annotation and passing the name of the column to which we want to map the property 
    // below

    @Column(name = "last_name")
    private String employeeLastName;

    // the code below is used to create a property for getting the email of the employee

    // using the @Column annotation below and passing the name of the column to which we want to map the property

    @Column(name = "email")
    private String employeeEmail;

    // the code below is used to create a default no-argument constructor
    public EmployeeEntity(){
        // the below line of code is for debugging purpose
        System.out.println("Employee entity: inside no");
    }
}
