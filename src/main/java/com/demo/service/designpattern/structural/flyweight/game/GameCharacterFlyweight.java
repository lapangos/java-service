package com.demo.service.designpattern.structural.flyweight.game;

public class GameCharacterFlyweight implements Flyweight {
    private final String characterType;

    public GameCharacterFlyweight(String characterType) {
        this.characterType = characterType;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Character Type: " + characterType + ", Position: (" + x + ", " + y + ")");
    }
}