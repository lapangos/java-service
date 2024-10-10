package com.demo.service.lld.paymentgateway;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public void process(Payment payment) {
        payment.processPayment();
    }
}