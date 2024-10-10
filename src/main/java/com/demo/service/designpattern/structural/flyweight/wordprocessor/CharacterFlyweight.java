package com.demo.service.designpattern.structural.flyweight.wordprocessor;

public class CharacterFlyweight implements Flyweight {
    private final char character;

    public CharacterFlyweight(char character) {
        this.character = character;
    }

    @Override
    public void display(int fontSize) {
        System.out.println("Character: " + character + ", Font Size: " + fontSize);
    }
}