package com.loanapprovalautomation;

public class Applicant {
	private String name;
	private int creditScore;
	private double income;
	private double loanAmount;
	
	public Applicant(String name, int creditScore, double income, double loanAmount) {
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
}
