package com.personaltrackerexpense;

import java.util.*;

public class BudgetWiseApp {
    public static void main(String[] args) {

        List<Transaction> transactions = List.of(
                new Transaction(5000, "EXPENSE", "01-01-2026", "Food"),
                new Transaction(3000, "EXPENSE", "05-01-2026", "Travel"),
                new Transaction(2000, "EXPENSE", "10-01-2026", "Shopping")
        );

        Map<String, Double> categoryLimits = Map.of(
                "Food", 4000.0,
                "Travel", 2500.0,
                "Shopping", 3000.0
        );

        Budget budget = new MonthlyBudget(
                20000,
                15000,
                categoryLimits,
                transactions
        );

        budget.generateReport();
        budget.detectOverspend();
    }
}
