package com.demo.service.designpattern.behavioral.state;

public class Item {
    private String name;
    private ItemType type;
    private double price;

    public Item(String name, ItemType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}