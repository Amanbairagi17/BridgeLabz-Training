package com.ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (debit(totalDeduction)) {
            receiver.getWallet().credit(amount);
            Transaction.log("Business Transfer (Tax applied)", amount);
            return true;
        }

        System.out.println("Transfer failed due to insufficient funds");
        return false;
    }
}

