package com.annotations.chachingresult;

public class Main {
    public static void main(String[] args) {

        MathService service = new MathService();

        System.out.println(ChacheManager.invoke(service, "factorial", 5));
        System.out.println(ChacheManager.invoke(service, "factorial", 5));
        System.out.println(ChacheManager.invoke(service, "factorial", 6));
        System.out.println(ChacheManager.invoke(service, "factorial", 5));
    }
}
