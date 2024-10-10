package com.demo.service.lld.ecommerce.coupons;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products;
    private Coupon coupon;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void applyCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public double calculateTotal() {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        if (coupon != null) {
            total = coupon.applyDiscount(total);
        }
        return total;
    }
}