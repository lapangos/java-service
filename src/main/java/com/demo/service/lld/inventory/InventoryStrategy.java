package com.demo.service.lld.inventory;

public interface InventoryStrategy {
    void execute(com.demo.service.lld.inventory.Inventory inventory, Product product);
}