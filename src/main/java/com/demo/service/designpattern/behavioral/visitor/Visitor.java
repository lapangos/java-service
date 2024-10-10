package com.demo.service.designpattern.behavioral.visitor;

public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}