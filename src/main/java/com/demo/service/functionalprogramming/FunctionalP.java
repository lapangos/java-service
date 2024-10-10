package com.demo.service.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalP {

    public static void main(String[] args) {
        List<Integer> list = List.of(23,4,56,777,89);

        Predicate<? super Integer> evenPredicate = getEvenPredicate();
        Predicate<? super Integer> oddPredicate = getOddPredicate();
        List.of(23,4,56,777,89).stream().filter(getEvenPredicate()).forEach(System.out::println);
    }

    private static Predicate<? super Integer> getOddPredicate() {
        return e -> e % 2 != 0;
    }

    private static Predicate<? super Integer> getEvenPredicate() {
        return e -> e % 2 == 0;
    }
}