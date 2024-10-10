package com.demo.service.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

    private int number;

    public Task (int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.print("Task KickedOff...");
        for (int i = number * 100; i < number * 100 + 99; i++) {
            System.out.print(i + " ");
        }
        System.out.print("Task Done...");
    }
}

public class ExecutorServiceRunner {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new MyThread());
        executorService.execute(new Thread(new Task2()));

        System.out.print("task3 KickedOff...");
        for (int i = 400; i < 500; i++) {
            System.out.print(i + " ");
        }

        executorService.shutdown();
    }
}