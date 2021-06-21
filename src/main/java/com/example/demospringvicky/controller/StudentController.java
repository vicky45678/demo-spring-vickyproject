package com.example.demospringvicky.controller;

import com.example.demospringvicky.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import java.util.List;

@RestController
public class StudentController {
    List<Student> studentList = new ArrayList<>();

    @RequestMapping("/add_student")
    public String add_student() {
        Student student = new Student(65,2433,"Aryan","placement");
        studentList.add(student);
        return "added student----" + student.getSalary();

    }
}