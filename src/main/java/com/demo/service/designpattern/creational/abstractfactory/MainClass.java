package com.demo.service.designpattern.creational.abstractfactory;

public class MainClass {
    public static void main(String[] args) {
        // Get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // Get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // Get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        // Get an object of Color Blue
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}