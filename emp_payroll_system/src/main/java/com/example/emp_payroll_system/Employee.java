package com.example.emp_payroll_system;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;
    private String name;
    private String department;
    private double salary;
    private String joiningdate;
    

    public Employee() {
    }

    public Employee(int id, String name, String department, double salary, String joiningdate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningdate = joiningdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getJoiningdate() {
        return joiningdate;
    }

    public void setJoiningdate(String joiningdate) {
        this.joiningdate = joiningdate;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", joiningdate=" + joiningdate +"]";
    }
}