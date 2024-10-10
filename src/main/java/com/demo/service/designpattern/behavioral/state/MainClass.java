package com.demo.service.designpattern.behavioral.state;

public class MainClass {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Item snack = new Item("Chips", ItemType.SNACK, 1.50);
        vendingMachine.addItem(snack);

        Coin coin = new Coin(2.00);

        vendingMachine.insertCoin(coin);
        vendingMachine.selectProduct(ItemType.SNACK);
        vendingMachine.dispense();

        vendingMachine.insertCoin(coin);
        vendingMachine.ejectCoin();
    }
}