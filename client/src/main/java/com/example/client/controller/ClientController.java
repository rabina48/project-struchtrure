package com.example.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rabina Shrestha
 * @EmaiL rabina.shrestha@f1soft.com
 */
@RestController
@RequestMapping("client")
public class ClientController {

    @GetMapping
    public ResponseEntity<?> getAllClient(){
        return  ResponseEntity.ok("Hey client!!");
    }
}
