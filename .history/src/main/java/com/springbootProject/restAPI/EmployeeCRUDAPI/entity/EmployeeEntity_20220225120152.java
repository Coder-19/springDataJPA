package com.springbootProject.restAPI.EmployeeCRUDAPI.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

// the code below is used to create a class for acting as an entity for the employees using the @Entity annotation

// using the @Table annotation and passing the name of the table as input for mapping the entity class below
// to the specific database table

// the class below maps to the employee mysql database table

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    
    // the code below is used to create a property for getting the id of the 
}
