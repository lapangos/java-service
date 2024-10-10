package com.demo.service.lld.carrental;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        PricingStrategy pricingStrategy = new StandardPricingStrategy(50.0);
        CarRentalService carRentalService = new CarRentalService(pricingStrategy);

        Car car1 = new Car("CAR123", "Toyota Camry");
        Car car2 = new Car("CAR456", "Honda Accord");

        carRentalService.addCar(car1);
        carRentalService.addCar(car2);

        Location location = new Location("123 Main St", "Springfield", "IL", "62701");
        User user = new User("John Doe", "D123456", location);

        Rental rental = carRentalService.rentCar(user, "CAR123", LocalDate.now(), LocalDate.now().plusDays(3));
        if (rental != null) {
            System.out.println("Rental successful: " + rental.getCar().getModel() + " for " + rental.getCustomer().getName());
        } else {
            System.out.println("Rental failed");
        }

        carRentalService.returnCar("CAR123");
    }
}