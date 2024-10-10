package com.demo.service.lld.ecommerce.coupons;

public class PercentageDiscountCoupon extends Coupon {
    private final double percentage;

    public PercentageDiscountCoupon(String code, double percentage) {
        super(code);
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - (totalAmount * (percentage / 100));
    }
}