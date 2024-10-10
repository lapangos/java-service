package com.demo.service.designpattern.structural.proxy;

public class RealService implements Service {
    @Override
    public String fetchData(String parameter) {
        // Simulate a time-consuming operation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return "Data for " + parameter;
    }
}