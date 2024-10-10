package com.demo.service.lld.parkinglot;

import java.util.List;

public class NearestFirstParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied()) {
                return spot;
            }
        }
        return null;
    }
}