package com.loanapprovalautomation;

public abstract class LoanApplication implements IApprovable {
	protected Applicant applicant;
	private int term;
	private double interestRate;
	private boolean approved;
	
	public LoanApplication(Applicant applicant, int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
		this.applicant = applicant;
	}

	@Override
	public boolean approveLoan() {
		if(applicant.getCreditScore() >= 650) approved = true;
		return approved;
	}

	
	protected double emiFormula(double rateMultiplier) {
		double P = applicant.getLoanAmount();
        double R = (interestRate / 12) / 100;
        int N = term;

        return (P * R * Math.pow(1 + R, N))
                / (Math.pow(1 + R, N) - 1) * rateMultiplier;
	}
	
	
	
}
