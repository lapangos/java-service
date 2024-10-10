package com.demo.service.designpattern.behavioral.strategy;

public class MainClass {
    public static void main(String[] args) {
        Context context = new Context();

        // Use Strategy A
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();

        // Use Strategy B
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}