package com.demo.service.lld.carrental;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private final List<Car> cars;
    private final List<Rental> rentals;
    private final PricingStrategy pricingStrategy;

    public CarRentalService(PricingStrategy pricingStrategy) {
        this.cars = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.pricingStrategy = pricingStrategy;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Rental rentCar(User customer, String licensePlate, LocalDate rentalDate, LocalDate returnDate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && !car.isRented()) {
                car.rent();
                double price = pricingStrategy.calculatePrice(rentalDate, returnDate);
                Rental rental = new Rental(car, customer, rentalDate, returnDate, price);
                rentals.add(rental);
                return rental;
            }
        }
        return null;
    }

    public void returnCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && car.isRented()) {
                car.returnVehicle();
                return;
            }
        }
    }
}