package com.example.demospringvicky.model;

public class Employee {
    String name;
    String Post;
    int sr_no;
    int salary;

    public Employee(String name, String post, int sr_no, int salary) {
        this.name = name;
        Post = post;
        this.sr_no = sr_no;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}