package com.demo.service.designpattern.behavioral.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}