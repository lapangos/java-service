package com.demo.service.lld.atm;

public abstract class Transaction {
    private final Card card;
    private final double amount;

    public Transaction(Card card, double amount) {
        this.card = card;
        this.amount = amount;
    }

    public Card getCard() {
        return card;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void execute(ATM atm);
}