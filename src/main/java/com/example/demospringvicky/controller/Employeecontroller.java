package com.example.demospringvicky.controller;

import com.example.demospringvicky.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    public class Employeecontroller {
    List<Employee> employeeList=new ArrayList<>();

    @RequestMapping("/add_employee")
    public String add_employee(){
        Employee employee=new Employee("vicky","S.I",110,67000);
        employeeList.add(employee);
        return "add_employee..."+employee.getSr_no();

    }
}
