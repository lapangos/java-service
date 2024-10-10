package com.demo.service.designpattern.structural.flyweight.wordprocessor;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<Character, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(char character) {
        if (!flyweights.containsKey(character)) {
            flyweights.put(character, new CharacterFlyweight(character));
        }
        return flyweights.get(character);
    }
}