package com.demo.service.lld.carrental;

public class User {
    private final String name;
    private final String driverLicense;
    private final Location location;

    public User(String name, String driverLicense, Location location) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public Location getLocation() {
        return location;
    }
}