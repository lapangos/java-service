package com.demo.service.lld.inventory;

public class MainClass {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        InventoryManager manager = new InventoryManager(inventory);

        Product product1 = new Product("1", "Laptop", 10);
        Product product2 = new Product("2", "Mouse", 50);

        manager.setStrategy(new AddProductStrategy());
        manager.executeStrategy(product1);
        manager.executeStrategy(product2);

        manager.setStrategy(new RemoveProductStrategy());
        manager.executeStrategy(product1);
    }
}