package com.demo.service.lld.atm;

public class MainClass {
    public static void main(String[] args) {
        ATM atm = new ATM(1000.0);
        Card card = new Card("1234-5678-9876-5432", "John Doe");

        TransactionProcessor transactionProcessor = new TransactionProcessorImpl();

        Transaction withdrawal = new Withdrawal(card, 200.0);
        Transaction deposit = new Deposit(card, 300.0);
        Transaction balanceInquiry = new BalanceInquiry(card);

        transactionProcessor.process(withdrawal, atm);
        transactionProcessor.process(deposit, atm);
        transactionProcessor.process(balanceInquiry, atm);
    }
}