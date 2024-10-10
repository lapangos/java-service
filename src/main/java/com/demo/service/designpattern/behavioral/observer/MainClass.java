package com.demo.service.designpattern.behavioral.observer;

public class MainClass {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1("Observer 1", subject);
        Observer observer2 = new ConcreteObserver2("Observer 2", subject);

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setMessage("Hello, Observers!");
        subject.setMessage("Observer Design Pattern Example");
    }
}