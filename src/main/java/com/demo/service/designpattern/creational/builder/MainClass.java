package com.demo.service.designpattern.creational.builder;

public class MainClass {

    public static void main(String[] args) {

       Employee employee = new Employeebuilder()
                .setName("John")
                .setAddress("1234 Main St")
                .setPhone("123-456-7890")
                .setEmail("john.adams@email.com")
                .setPosition("Developer")
                .setDepartment("IT")
                .build();

         System.out.println(employee);
    }
}