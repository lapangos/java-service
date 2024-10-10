package com.demo.service.lld.ecommerce.coupons;

public class CouponStrategyImpl implements CouponStrategy {
    @Override
    public double applyCoupon(Cart cart) {
        return cart.calculateTotal();
    }
}