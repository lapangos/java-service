package com.demo.service.designpattern.behavioral.template;

public class MainClass {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();

        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}