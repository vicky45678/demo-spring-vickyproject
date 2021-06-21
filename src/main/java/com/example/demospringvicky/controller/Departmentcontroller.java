package com.example.demospringvicky.controller;


import com.example.demospringvicky.model.Department;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Departmentcontroller {
    List<Department> departmentList=new ArrayList<>();

    @RequestMapping("/add_Department")
    public String add_Department(){
        Department department=new Department("shivani","pwd","firozabad",2,45000);
        departmentList.add(department);
        return "add_department..."+department.getPost();


    }
}
