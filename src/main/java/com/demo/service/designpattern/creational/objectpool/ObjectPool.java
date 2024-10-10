package com.demo.service.designpattern.creational.objectpool;

public interface ObjectPool<T> {
    T acquire();
    void release(T obj);
}