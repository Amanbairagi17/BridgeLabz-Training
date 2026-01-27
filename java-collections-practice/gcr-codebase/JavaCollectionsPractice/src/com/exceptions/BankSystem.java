package com.exceptions;

import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
        finally {
            sc.close();
        }
    }
}