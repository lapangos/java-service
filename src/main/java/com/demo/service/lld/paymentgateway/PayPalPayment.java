package com.demo.service.lld.paymentgateway;

public class PayPalPayment extends Payment {
    private final String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + getAmount() + " using email " + email);
    }
}