package com.annotations.logginproxy;

public class Main {

    public static void main(String[] args) {

        Greeting greeting = new GreetingImpl();

        Greeting proxyGreeting =
                ProxyFactory.createProxy(greeting);

        proxyGreeting.sayHello("Aman");
    }
}
