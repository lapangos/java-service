package com.demo.service.lld.carrental;

import java.time.LocalDate;

public interface PricingStrategy {
    double calculatePrice(LocalDate rentalDate, LocalDate returnDate);
}