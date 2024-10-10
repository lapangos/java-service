package com.demo.service.designpattern.creational.singleton;

public class MainClass {
    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // Show the message
        singleton.showMessage();
    }
}