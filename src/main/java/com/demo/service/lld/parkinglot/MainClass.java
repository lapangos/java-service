package com.demo.service.lld.parkinglot;

public class MainClass {
    public static void main(String[] args) {
        ParkingStrategy strategy = new NearestFirstParkingStrategy();
        ParkingLot parkingLot = new ParkingLot(5, strategy);

        Vehicle car1 = new Car("CAR123");
        Vehicle bike1 = new Bike("BIKE123");

        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(bike1);

        parkingLot.vacateSpot(1);
        parkingLot.vacateSpot(2);
    }
}