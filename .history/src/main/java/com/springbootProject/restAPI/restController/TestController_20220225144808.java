package com.springbootProject.restAPI.restController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String testApi(){
        return "test successfull";
    }
}
