package com.demo.service.lld.inventory;

public class InventoryManager {
    private final com.demo.service.lld.inventory.Inventory inventory;
    private InventoryStrategy strategy;

    public InventoryManager(com.demo.service.lld.inventory.Inventory inventory) {
        this.inventory = inventory;
    }

    public void setStrategy(InventoryStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Product product) {
        strategy.execute(inventory, product);
    }
}