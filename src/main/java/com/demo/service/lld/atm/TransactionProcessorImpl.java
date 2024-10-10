package com.demo.service.lld.atm;

public class TransactionProcessorImpl implements TransactionProcessor {
    @Override
    public void process(Transaction transaction, ATM atm) {
        transaction.execute(atm);
    }
}