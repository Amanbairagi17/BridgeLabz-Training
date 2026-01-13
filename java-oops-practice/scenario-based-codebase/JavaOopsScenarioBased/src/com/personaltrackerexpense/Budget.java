package com.personaltrackerexpense;

import java.util.List;
import java.util.Map;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, double limit,
                  Map<String, Double> categoryLimits,
                  List<Transaction> transactions) {

        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = transactions;
    }

    // Operator usage
    protected double calculateTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    protected double calculateSavings() {
        return income - calculateTotalExpenses(); // income - expenses
    }
}
