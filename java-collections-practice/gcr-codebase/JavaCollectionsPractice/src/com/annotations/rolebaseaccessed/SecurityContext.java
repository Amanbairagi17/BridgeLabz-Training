package com.annotations.rolebaseaccessed;

public class SecurityContext {

    private static String currentRole;

    public static void setRole(String role) {
        currentRole = role;
    }

    public static String getRole() {
        return currentRole;
    }
}
