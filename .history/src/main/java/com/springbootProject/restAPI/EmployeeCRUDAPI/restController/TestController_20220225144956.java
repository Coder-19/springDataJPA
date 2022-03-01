package com.springbootProject.restAPI.EmployeeCRUDAPI.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String testApi(){
        return "test successfull";
    }
}
