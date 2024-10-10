package com.demo.service.lld.inventory;

public class RemoveProductStrategy implements InventoryStrategy {
    @Override
    public void execute(Inventory inventory, Product product) {
        inventory.removeProduct(product.getId());
        System.out.println("Product removed: " + product.getName());
    }
}