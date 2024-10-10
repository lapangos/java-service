package com.demo.service.lld.atm;

public class BalanceInquiry extends Transaction {
    public BalanceInquiry(Card card) {
        super(card, 0);
    }

    @Override
    public void execute(ATM atm) {
        System.out.println("Current balance: $" + atm.getBalance());
    }
}