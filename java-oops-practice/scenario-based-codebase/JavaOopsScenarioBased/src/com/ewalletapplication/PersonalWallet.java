package com.ewalletapplication;

public class PersonalWallet extends Wallet {

	//final variable for day limits
    private static final double DAILY_LIMIT = 20000;

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }


    public boolean transferTo(User receiver, double amount) {

        if (amount > DAILY_LIMIT) {
            System.out.println("Transfer limit exceeded for personal wallet");
            return false;
        }

        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            Transaction.log("Personal Transfer", amount);
            return true;
        }

        System.out.println("Insufficient balance");
        return false;
    }
}

