package com.demo.service.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println(name);
        for (Component component : components) {
            component.showDetails();
        }
    }
}