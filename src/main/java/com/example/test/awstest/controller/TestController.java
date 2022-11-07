package com.example.test.awstest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value="ping")
   public String health(){
        return "pong";
    }
}
