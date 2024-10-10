package com.demo.service.designpattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null; // ColorFactory doesn't produce shapes
    }

    @Override
    public Color getColor(String colorType) {
        return switch (colorType) {
            case "RED" -> new Red();
            case "BLUE" -> new Blue();
            default -> null;
        };
    }
}