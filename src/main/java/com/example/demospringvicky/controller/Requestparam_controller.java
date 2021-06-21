package com.example.demospringvicky.controller;

import com.sun.org.apache.xpath.internal.operations.Variable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Requestparam_controller {

    //request param
    @RequestMapping("/request_param")
    public String demo_request_param(@RequestParam String var_messege) {
        return var_messege + "this value was entered from ui";
    }

    @RequestMapping("/request_int")
    public String demo_request_param_int(@RequestParam int value) {
        return value + "this value from ui";
    }

    @RequestMapping("/request_float")
    public String demo_request_param_float(@RequestParam float ratio) {
        return ratio + "this value from ui";

    }

    @RequestMapping("/request_boolean")
    public String demo_request_param_boolean(@RequestParam boolean right ) {
        return right + "this value from ui";
    }

}







