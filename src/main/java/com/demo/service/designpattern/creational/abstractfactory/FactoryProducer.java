package com.demo.service.designpattern.creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        return switch (choice) {
            case "SHAPE" -> new ShapeFactory();
            case "COLOR" -> new ColorFactory();
            default -> null;
        };
    }
}