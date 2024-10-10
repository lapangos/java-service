package com.demo.service.lld.ecommerce.coupons;

public abstract class Coupon {
    private final String code;

    public Coupon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public abstract double applyDiscount(double totalAmount);
}