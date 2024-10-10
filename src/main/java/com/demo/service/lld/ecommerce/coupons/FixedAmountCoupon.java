package com.demo.service.lld.ecommerce.coupons;

public class FixedAmountCoupon extends Coupon {
    private final double discountAmount;

    public FixedAmountCoupon(String code, double discountAmount) {
        super(code);
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - discountAmount;
    }
}