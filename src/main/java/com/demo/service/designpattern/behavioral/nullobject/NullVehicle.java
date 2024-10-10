package com.demo.service.designpattern.behavioral.nullobject;

public class NullVehicle implements Vehicle {
    @Override
    public void start() {
        System.out.println("No vehicle to start.");
    }

    @Override
    public void stop() {
        System.out.println("No vehicle to stop.");
    }
}