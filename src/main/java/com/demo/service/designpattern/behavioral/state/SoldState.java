package com.demo.service.designpattern.behavioral.state;

public class SoldState implements State {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing product.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin after product is sold.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already sold.");
    }

    @Override
    public void dispense() {
        System.out.println("Product already dispensed.");
    }
}