package com.example.demospringvicky.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculatorcontroller {

    @RequestMapping("/Greet")
    public String greet(){
        return "matriculation world";

    }
    //path variable
    @RequestMapping("/multiply/{b}/{c}")
    public int multiply(@PathVariable int b, @PathVariable int c){
        int multply=b*c;
        return multply;
    }
    @RequestMapping("/add/{b}/{c}")
    public int add(@PathVariable int b, @PathVariable int c){
        int sum=b+c;
        return sum;
    }
    @RequestMapping("/divide/{b}/{c}")
    public int divide(@PathVariable int b, @PathVariable int c){
        int divide=b/c;
        return divide;
    }
    @RequestMapping("/subtract/{b}/{c}")
    public int subtract(@PathVariable int b, @PathVariable int c){
        int subtract=b-c;
        return subtract;
    }
    //Request param
    @RequestMapping("/messege")
    public String messege(@RequestParam String messsege){
        String messege;
        return "is the function of calculation";
    }
}
