package com.demo.service.lld.paymentgateway;

public abstract class Payment {
    private final double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();
}