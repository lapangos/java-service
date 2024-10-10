package com.demo.service.lld.inventory;

public class AddProductStrategy implements InventoryStrategy {
    @Override
    public void execute(Inventory inventory, Product product) {
        inventory.addProduct(product);
        System.out.println("Product added: " + product.getName());
    }
}