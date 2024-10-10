package com.demo.service.lld.carrental;

import java.time.LocalDate;

public class Rental {
    private final Car car;
    private final User customer;
    private final LocalDate rentalDate;
    private final LocalDate returnDate;
    private final double price;

    public Rental(Car car, User customer, LocalDate rentalDate, LocalDate returnDate, double price) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public User getCustomer() {
        return customer;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getPrice() {
        return price;
    }
}