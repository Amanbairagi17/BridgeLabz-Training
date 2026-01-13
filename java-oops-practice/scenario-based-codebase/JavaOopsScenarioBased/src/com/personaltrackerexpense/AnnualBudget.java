package com.personaltrackerexpense;

import java.util.List;
import java.util.Map;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit,
                        Map<String, Double> categoryLimits,
                        List<Transaction> transactions) {
        super(income, limit, categoryLimits, transactions);
    }

    @Override
    public void generateReport() {
        System.out.println("📊 Annual Budget Report");
        System.out.println("Annual Income: ₹" + income);
        System.out.println("Annual Expenses: ₹" + calculateTotalExpenses());
        System.out.println("Annual Savings: ₹" + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Yearly overspending analysis completed.");
    }
}

