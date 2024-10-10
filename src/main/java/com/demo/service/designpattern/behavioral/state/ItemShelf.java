package com.demo.service.designpattern.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem() {
        if (!items.isEmpty()) {
            return items.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}