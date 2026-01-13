package com.utilitybillpaymentsystem;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;

    private boolean isPaid;     // cannot be changed directly
    private double penalty;     // internal only

    // Constructor for recurring bills
    public Bill(String type, double amount, String dueDate, double penalty) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.penalty = penalty;
        this.isPaid = false;
    }

    // Operator usage: baseAmount + penalty
    protected double calculateTotalAmount() {
        return amount + penalty;
    }

    @Override
    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid. Amount: ₹" + calculateTotalAmount());
        } else {
            System.out.println(type + " bill already paid.");
        }
    }

    protected boolean isPaid() {
        return isPaid;
    }
}
