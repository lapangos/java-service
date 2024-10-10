package com.demo.service.lld.atm;

public interface TransactionProcessor {
    void process(Transaction transaction, ATM atm);
}