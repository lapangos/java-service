package com.demo.service.designpattern.creational.builder;

public record Employee(String name, String address, String phone, String email, String position, String department) {

    public Employee(Employeebuilder employeebuilder) {
        this(
                employeebuilder.getName(),
                employeebuilder.getAddress(),
                employeebuilder.getPhone(),
                employeebuilder.getEmail(),
                employeebuilder.getPosition(),
                employeebuilder.getDepartment()
        );
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}