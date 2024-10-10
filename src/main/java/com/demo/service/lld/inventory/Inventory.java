package com.demo.service.lld.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void removeProduct(String productId) {
        products.remove(productId);
    }
}