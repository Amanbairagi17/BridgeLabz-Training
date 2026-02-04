package com.functionalinterface.defaultinterface.staticmethod;

public interface SecurityUtils {

    // Static method for password validation
    static boolean isStrongPassword(String password) {

        if (password == null) return false;

        // Rule 1: Minimum length 8
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        // Rule 2–5 combined
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

