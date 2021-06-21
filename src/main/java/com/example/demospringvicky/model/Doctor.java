package com.example.demospringvicky.model;

public class Doctor {
    String doctorName;
    String department;
    int number;
    int sr_no;

    public Doctor(String doctorName, String department, int number, int rollno) {
        this.doctorName = doctorName;
        this.department = department;
        this.number = number;
        this.sr_no = rollno;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRollno() {
        return sr_no;
    }

    public void setRollno(int rollno) {
        this.sr_no = rollno;
    }
}
