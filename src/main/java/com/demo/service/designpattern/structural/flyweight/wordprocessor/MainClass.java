package com.demo.service.designpattern.structural.flyweight.wordprocessor;

public class MainClass {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        String document = "Hello World";
        int[] fontSizes = {12, 14, 12, 14, 12, 14, 12, 14, 12, 14, 12};

        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            Flyweight flyweight = factory.getFlyweight(character);
            flyweight.display(fontSizes[i]);
        }
    }
}