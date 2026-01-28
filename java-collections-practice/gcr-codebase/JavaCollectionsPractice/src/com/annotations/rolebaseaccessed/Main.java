package com.annotations.rolebaseaccessed;

public class Main {
    public static void main(String[] args) {

        AdminService service = new AdminService();

        // user login
        SecurityContext.setRole("USER");

        AccessManager.invoke(service, "viewProfile");   // allowed
        AccessManager.invoke(service, "deleteUser");    // denied

        // admin login
        SecurityContext.setRole("ADMIN");

        AccessManager.invoke(service, "deleteUser");    //allowed
    }
}
