package com.demo.service.designpattern.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}