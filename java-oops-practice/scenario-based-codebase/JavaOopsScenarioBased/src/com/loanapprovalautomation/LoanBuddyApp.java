package com.loanapprovalautomation;

import java.util.Scanner;

public class LoanBuddyApp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        Applicant applicant =
                new Applicant(name, creditScore, income, loanAmount);

        LoanApplication loan = new HomeLoan(applicant, term);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected!");
        }
    }
}
