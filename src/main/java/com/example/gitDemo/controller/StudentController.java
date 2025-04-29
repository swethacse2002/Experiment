package com.example.gitDemo.controller;

import com.example.gitDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    /**
     * Method to get a simple message
     * @return a string
     */
    @GetMapping("/")
    public String getTheMessage(){
        return studentService.getMessage();
    }

    /**
     * Method to get a another message
     * @return a string value
     */
    @GetMapping("/hello")
    public String getTheMessages(){
        return studentService.getMessage();
    }
}
