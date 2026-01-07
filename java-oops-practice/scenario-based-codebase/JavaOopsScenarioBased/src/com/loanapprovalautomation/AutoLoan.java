package com.loanapprovalautomation;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.05); // normal EMI
    }
}