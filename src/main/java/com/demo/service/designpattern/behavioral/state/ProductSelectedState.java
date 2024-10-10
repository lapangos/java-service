package com.demo.service.designpattern.behavioral.state;

public class ProductSelectedState implements State {
    private VendingMachine vendingMachine;

    public ProductSelectedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin after product selection.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected.");
    }

    @Override
    public void dispense() {
        Item item = vendingMachine.dispenseItem(ItemType.SNACK); // Example item type
        if (item != null && vendingMachine.getCurrentBalance() >= item.getPrice()) {
            System.out.println("Dispensing product: " + item.getName());
            vendingMachine.resetBalance();
            vendingMachine.setState(vendingMachine.getNoCoinState());
        } else {
            System.out.println("Insufficient balance or item not available.");
            vendingMachine.setState(vendingMachine.getHasCoinState());
        }
    }
}