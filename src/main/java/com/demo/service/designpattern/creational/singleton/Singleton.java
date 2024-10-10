package com.demo.service.designpattern.creational.singleton;

public class Singleton {
    // Private static variable of the same class that is the only instance of the class
    private static volatile Singleton instance;

    // Private constructor to restrict instantiation of the class from other classes
    private Singleton() {}

    // Public static method that returns the instance of the class, creating it if it doesn't exist
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

//    private static final class SingletonHolder {
//        // Private static variable of the same class that is the only instance of the class
//        private static final Singleton instance = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return SingletonHolder.instance;
//    }

}