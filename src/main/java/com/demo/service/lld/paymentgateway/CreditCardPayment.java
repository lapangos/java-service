package com.demo.service.lld.paymentgateway;

public class CreditCardPayment extends Payment {
    private final String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + getAmount() + " using card number " + cardNumber);
    }
}