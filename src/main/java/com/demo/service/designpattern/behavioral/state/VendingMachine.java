package com.demo.service.designpattern.behavioral.state;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State productSelectedState;
    private State soldState;

    private State currentState;
    private Map<ItemType, ItemShelf> inventory = new HashMap<>();
    private double currentBalance = 0;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        productSelectedState = new ProductSelectedState(this);
        soldState = new SoldState(this);

        currentState = noCoinState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getProductSelectedState() {
        return productSelectedState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void insertCoin(Coin coin) {
        currentBalance += coin.getValue();
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentBalance = 0;
        currentState.ejectCoin();
    }

    public void selectProduct(ItemType itemType) {
        if (inventory.containsKey(itemType) && !inventory.get(itemType).isEmpty()) {
            currentState.selectProduct();
        } else {
            System.out.println("Item not available.");
        }
    }

    public void dispense() {
        currentState.dispense();
    }

    public void addItem(Item item) {
        inventory.computeIfAbsent(item.getType(), k -> new ItemShelf()).addItem(item);
    }

    public Item dispenseItem(ItemType itemType) {
        if (inventory.containsKey(itemType)) {
            return inventory.get(itemType).getItem();
        }
        return null;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void resetBalance() {
        currentBalance = 0;
    }
}