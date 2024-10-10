package com.demo.service.designpattern.creational.builder;

public class Employeebuilder {

    private String name;
    private String address;
    private String phone;
    private String email;
    private String position;
    private String department;

    public Employeebuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Employeebuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Employeebuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Employeebuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employeebuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public Employeebuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public Employee build() {
        return new Employee(this);
    }

}