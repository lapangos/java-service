package com.demo.service.designpattern.structural.flyweight.game;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String characterType) {
        if (!flyweights.containsKey(characterType)) {
            flyweights.put(characterType, new GameCharacterFlyweight(characterType));
        }
        return flyweights.get(characterType);
    }
}