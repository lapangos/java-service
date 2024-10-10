package com.demo.service.designpattern.behavioral.strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Strategy B");
    }
}