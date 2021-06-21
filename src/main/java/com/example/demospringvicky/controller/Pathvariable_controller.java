package com.example.demospringvicky.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pathvariable_controller {

    //path_variable
    @RequestMapping("/greeting//[messege]")
    public String greeting(@PathVariable String messege){
        String greetingmessege;
        return greeting(messege);
    }
}
