package com.demo.service.lld.atm;

public class Deposit extends Transaction {
    public Deposit(Card card, double amount) {
        super(card, amount);
    }

    @Override
    public void execute(ATM atm) {
        atm.updateBalance(getAmount());
        System.out.println("Deposit of $" + getAmount() + " successful.");
    }
}