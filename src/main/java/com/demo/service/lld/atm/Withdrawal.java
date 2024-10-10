package com.demo.service.lld.atm;

public class Withdrawal extends Transaction {
    public Withdrawal(Card card, double amount) {
        super(card, amount);
    }

    @Override
    public void execute(ATM atm) {
        if (atm.getBalance() >= getAmount()) {
            atm.updateBalance(-getAmount());
            System.out.println("Withdrawal of $" + getAmount() + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}