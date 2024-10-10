package com.demo.service.lld.splitwise;

import java.util.List;

public class Expense {
    private final String expenseId;
    private final double amount;
    private final User paidBy;
    private final List<Split> splits;

    public Expense(String expenseId, double amount, User paidBy, List<Split> splits) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }
}