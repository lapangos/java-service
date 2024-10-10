package com.demo.service.designpattern.behavioral.nullobject;

public class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Bike".equalsIgnoreCase(type)) {
            return new Bike();
        }
        return new NullVehicle();
    }
}