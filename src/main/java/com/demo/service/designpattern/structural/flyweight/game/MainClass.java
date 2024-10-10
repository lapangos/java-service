package com.demo.service.designpattern.structural.flyweight.game;

public class MainClass {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight soldier1 = factory.getFlyweight("Soldier");
        soldier1.display(10, 20);

        Flyweight soldier2 = factory.getFlyweight("Soldier");
        soldier2.display(30, 40);

        Flyweight tank1 = factory.getFlyweight("Tank");
        tank1.display(50, 60);

        Flyweight tank2 = factory.getFlyweight("Tank");
        tank2.display(70, 80);

        System.out.println("soldier1 == soldier2: " + (soldier1 == soldier2));
        System.out.println("tank1 == tank2: " + (tank1 == tank2));
    }
}