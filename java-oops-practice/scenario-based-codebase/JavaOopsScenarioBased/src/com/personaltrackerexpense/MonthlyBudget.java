package com.personaltrackerexpense;

import java.util.List;
import java.util.Map;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit,
                         Map<String, Double> categoryLimits,
                         List<Transaction> transactions) {
        super(income, limit, categoryLimits, transactions);
    }

    @Override
    public void generateReport() {
        System.out.println("Monthly Budget Report");
        System.out.println("Income: ₹" + income);
        System.out.println("Expenses: ₹" + calculateTotalExpenses());
        System.out.println("Savings: ₹" + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        for (String category : categoryLimits.keySet()) {
            double spent = 0;
            for (Transaction t : transactions) {
                if (t.getCategory().equals(category)) {
                    spent += t.getAmount();
                }
            }
            if (spent > categoryLimits.get(category)) {
                System.out.println("Overspent in " + category);
            }
        }
    }
}
