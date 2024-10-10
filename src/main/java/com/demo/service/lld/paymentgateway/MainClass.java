package com.demo.service.lld.paymentgateway;

public class MainClass {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();

        Payment creditCardPayment = new CreditCardPayment(100.0, "1234-5678-9876-5432");
        Payment payPalPayment = new PayPalPayment(200.0, "user@example.com");

        paymentProcessor.process(creditCardPayment);
        paymentProcessor.process(payPalPayment);
    }
}