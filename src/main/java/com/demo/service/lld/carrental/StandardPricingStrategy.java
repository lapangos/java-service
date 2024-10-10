package com.demo.service.lld.carrental;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StandardPricingStrategy implements PricingStrategy {
    private final double dailyRate;

    public StandardPricingStrategy(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculatePrice(LocalDate rentalDate, LocalDate returnDate) {
        long days = ChronoUnit.DAYS.between(rentalDate, returnDate);
        return days * dailyRate;
    }
}