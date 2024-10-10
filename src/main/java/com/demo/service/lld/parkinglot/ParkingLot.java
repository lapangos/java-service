package com.demo.service.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<ParkingSpot> parkingSpots;
    private final ParkingStrategy parkingStrategy;

    public ParkingLot(int numberOfSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = new ArrayList<>();
        for (int i = 1; i <= numberOfSpots; i++) {
            parkingSpots.add(new ParkingSpot(i));
        }
        this.parkingStrategy = parkingStrategy;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = parkingStrategy.findParkingSpot(parkingSpots);
        if (spot != null) {
            spot.occupy();
            System.out.println(vehicle.getLicensePlate() + " parked at spot " + spot.getSpotNumber());
            return true;
        }
        System.out.println("No available parking spot for " + vehicle.getLicensePlate());
        return false;
    }

    public void vacateSpot(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                spot.vacate();
                System.out.println("Spot " + spotNumber + " is now vacant");
                return;
            }
        }
        System.out.println("Spot " + spotNumber + " not found");
    }
}