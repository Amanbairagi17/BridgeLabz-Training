package com.functionalinterface.defaultinterface.staticmethod;

public class Main {
    public static void main(String[] args) {

        String password = "Ins@1234";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password accepted");
        } else {
            System.out.println("Weak password");
        }
    }
}
