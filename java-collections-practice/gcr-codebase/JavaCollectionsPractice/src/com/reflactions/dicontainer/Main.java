package com.reflactions.dicontainer;

public class Main {

    public static void main(String[] args) {

        DIcontainer container = new DIcontainer();

        UserService userService =
                container.getBean(UserService.class);

        userService.registerUser();
    }
}
