package com.reflactions.methodexecutiontime;

public class TaskService {

    public void processData() throws InterruptedException {
        Thread.sleep(300);
    }

    public void calculate() throws InterruptedException {
        Thread.sleep(150);
    }

    public void loadFiles() throws InterruptedException {
        Thread.sleep(500);
    }
}
