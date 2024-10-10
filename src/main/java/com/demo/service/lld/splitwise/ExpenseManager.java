package com.demo.service.lld.splitwise;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private final List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}