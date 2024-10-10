package com.demo.service.designpattern.behavioral.visitor;

public class MainClass {
    public static void main(String[] args) {
        Element[] elements = {new ConcreteElementA(), new ConcreteElementB()};
        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}