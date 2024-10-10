package com.demo.service.multithreading;

public class ThreadingBasic {

    public static void main(String[] args) throws InterruptedException {
        System.out.print("thread1 KickedOff...");
        MyThread thread = new MyThread();
        thread.setPriority(1);
        thread.start();

        System.out.print("task2 KickedOff...");
        Task2 task2 = new Task2();
        Thread thread2 = new Thread(task2);
        thread2.setPriority(10);
        thread2.start();

        // merger 2 threads and one thread should be completed for the other to start
        thread.join();
        thread2.join();

        // for delay or sleep or wait
        Thread.sleep(10000);

        Thread.yield();

        System.out.print("task3 KickedOff...");
        for (int i = 400; i < 500; i++) {
            System.out.print(i + " ");
        }
    }

}

class MyThread extends Thread {
    public void run() {
        System.out.print("thread1 Started...");
        int i = 100;
        while (i < 200) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("thread1 Done...");
    }
}

class Task2 implements Runnable {
    public void run() {
        int i = 201;
        System.out.print("Task2 Started...");
        while (i < 300) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("Task2 Done...");
    }
}