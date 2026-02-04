package com.functionalinterface.examples;

public class AsyncrosousTask {

    public static void main(String[] args) {

        // Runnable using lambda
        Runnable task = () -> {
            System.out.println("Task started by: " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000); // simulate time-consuming work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Task completed by: " + Thread.currentThread().getName());
        };

        // Execute task asynchronously
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues execution...");
    }
}
