package com.demo.service.designpattern.behavioral.nullobject;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }
}