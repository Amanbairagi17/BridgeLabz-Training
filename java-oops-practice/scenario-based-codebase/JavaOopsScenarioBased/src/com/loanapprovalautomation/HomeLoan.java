package com.loanapprovalautomation;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    @Override
    public double calculateEMI() {
        return emiFormula(1.0); // normal EMI
    }
}
