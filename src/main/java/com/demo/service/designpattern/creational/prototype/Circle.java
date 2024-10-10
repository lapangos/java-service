package com.demo.service.designpattern.creational.prototype;

public class Circle implements Prototype {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}