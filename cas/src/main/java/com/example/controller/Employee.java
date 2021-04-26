package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rabina Shrestha
 * @EmaiL rabina.shrestha@f1soft.com
 */
@RestController
@RequestMapping(path = "/employees")
public class Employee
{

    @GetMapping(path="", produces = "application/json")
    public String getEmployees()
    {
        return "Hello Basic";
    }
}