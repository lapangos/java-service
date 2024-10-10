package com.demo.service.designpattern.creational.abstractfactory;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }

    @Override
    public Color getColor(String colorType) {
        return null; // ShapeFactory doesn't produce colors
    }
}