package com.demo.service.designpattern.creational.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}