package com.demo.service.designpattern.creational.prototype;

public class Rectangle implements Prototype {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}