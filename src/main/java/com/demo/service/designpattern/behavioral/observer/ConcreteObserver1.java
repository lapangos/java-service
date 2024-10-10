package com.demo.service.designpattern.behavioral.observer;

public class ConcreteObserver1 implements Observer {
    private String name;
    private Subject subject;

    public ConcreteObserver1(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}