package com.demo.service.designpattern.behavioral.nullobject;

public class MainClass {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.start();
        car.stop();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.start();
        bike.stop();

        Vehicle unknown = VehicleFactory.getVehicle("Truck");
        unknown.start();
        unknown.stop();
    }
}