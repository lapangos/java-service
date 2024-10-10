package com.demo.service.designpattern.creational.prototype;

public class MainClass {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        // Add prototypes to the registry
        registry.addPrototype("Circle", new Circle(10));
        registry.addPrototype("Rectangle", new Rectangle(20, 30));

        // Get clones of the prototypes
        Circle clonedCircle = (Circle) registry.getPrototype("Circle");
        Rectangle clonedRectangle = (Rectangle) registry.getPrototype("Rectangle");

        // Display the cloned objects
        System.out.println(clonedCircle);
        System.out.println(clonedRectangle);
    }
}