package com.demo.service.lld.ecommerce.coupons;

public class MainClass {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("Laptop", 1000.0));
        cart.addProduct(new Product("Mouse", 50.0));

        Coupon percentageCoupon = new PercentageDiscountCoupon("PERC10", 10);
        cart.applyCoupon(percentageCoupon);

        CouponStrategy couponStrategy = new CouponStrategyImpl();
        double total = couponStrategy.applyCoupon(cart);
        System.out.println("Total after applying percentage coupon: $" + total);

        cart.applyCoupon(new FixedAmountCoupon("FIXED50", 50));
        total = couponStrategy.applyCoupon(cart);
        System.out.println("Total after applying fixed amount coupon: $" + total);
    }
}