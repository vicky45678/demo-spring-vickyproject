package com.example.demospringvicky.model;

public class Pathvariable {
    String name;
    String post;
    int nu;
    int value;

    public Pathvariable(String name, String post, int nu, int value) {
        this.name = name;
        this.post = post;
        this.nu = nu;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
