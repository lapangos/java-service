package com.demo.service.lld.splitwise;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        User user1 = new User("1", "Alice", "alice@example.com");
        User user2 = new User("2", "Bob", "bob@example.com");

        Split split1 = new EqualSplit(user1);
        Split split2 = new EqualSplit(user2);

        Expense expense = new Expense("1", 100.0, user1, Arrays.asList(split1, split2));

        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.addExpense(expense);

        for (Expense exp : expenseManager.getExpenses()) {
            System.out.println("Expense ID: " + exp.getExpenseId() + ", Amount: " + exp.getAmount());
        }
    }
}