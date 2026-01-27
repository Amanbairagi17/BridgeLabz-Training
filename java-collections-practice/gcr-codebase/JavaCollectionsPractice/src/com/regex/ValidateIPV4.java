package com.regex;

public class ValidateIPV4 {
    public static boolean isValidIPv4(String ip) {

        String regex =
            "^((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}"
          + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})$";

        return ip.matches(regex);
    }

    public static void main(String[] args) {

        System.out.println(isValidIPv4("192.168.1.1"));   // true
        System.out.println(isValidIPv4("255.255.255.255"));// true
        System.out.println(isValidIPv4("256.10.1.1"));    // false
        System.out.println(isValidIPv4("192.168.1"));     // false
        System.out.println(isValidIPv4("192.168.01.1"));  // true
    }
}
