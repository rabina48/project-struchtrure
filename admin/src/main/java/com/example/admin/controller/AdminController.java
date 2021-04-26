package com.example.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rabina Shrestha
 * @EmaiL rabina.shrestha@f1soft.com
 */

@RestController
@RequestMapping()
public class AdminController {
    @GetMapping("get")
    public ResponseEntity<?> getAllClient(){
        return  ResponseEntity.ok("Hey Admin!!");
    }
}
