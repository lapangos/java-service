package com.demo.service.designpattern.structural.composite;

public class MainClass {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");

        Composite composite1 = new Composite("Composite 1");
        Composite composite2 = new Composite("Composite 2");

        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);

        composite2.addComponent(leaf3);
        composite2.addComponent(composite1);

        composite2.showDetails();
    }
}