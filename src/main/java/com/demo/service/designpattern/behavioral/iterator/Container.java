package com.demo.service.designpattern.behavioral.iterator;

public interface Container<T> {
    Iterator<T> getIterator();
}