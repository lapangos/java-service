package com.demo.service.designpattern.creational.abstractfactory;

public interface AbstractFactory {
    Shape getShape(String shapeType);
    Color getColor(String colorType);
}