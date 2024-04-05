package com.example.day1__q01.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/hello")         //@RequestMapping used for the enitre class
public class Welcome {
    @GetMapping("/Welcome")   //GetMapping is used in specific method
    public String  Welcome()
    {
        return " Welcome Spring Boot ";       //return to print on the browser through API
    }
   
}

