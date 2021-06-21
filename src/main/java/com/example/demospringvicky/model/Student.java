package com.example.demospringvicky.model;

public class Student {

    int num;
    int salary;
    String name;
    String application;

    public Student(int num, int salary, String name, String application) {
        this.num = num;
        this.salary = salary;
        this.name = name;
        this.application = application;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
