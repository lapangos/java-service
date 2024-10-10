package com.demo.service.designpattern.behavioral.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    void setMessage(String message);
}