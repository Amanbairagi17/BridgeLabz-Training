package com.encapsulationandpolymorphism.bankingmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
        List<BankAccount> list = new ArrayList<>();
        list.add(new SavingsAccount(0, "Aman", 50000));
        list.add(new CurrentAccount(1, "Tarun", 80000));

        for (BankAccount account : list) {
            System.out.println("Account : " + account.getAccountNumber());
            System.out.println("Interest : " + account.calculateInterest());
            account.applyForLoan();
            System.out.println("Loan eligibility : " + account.calculateLoanEligibility());
        }
    }
}
