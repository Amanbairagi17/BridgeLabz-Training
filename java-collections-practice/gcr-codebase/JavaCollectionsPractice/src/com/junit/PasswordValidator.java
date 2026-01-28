package com.junit;

public class PasswordValidator {

    public boolean isValid(String password) {

        if (password == null) return false;

        // at least 8 characters
        if (password.length() < 8) return false;

        // at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) return false;

        // at least one digit
        if (!password.matches(".*\\d.*")) return false;

        return true;
    }
}
