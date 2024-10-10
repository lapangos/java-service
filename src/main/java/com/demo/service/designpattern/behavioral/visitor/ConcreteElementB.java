package com.demo.service.designpattern.behavioral.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "ConcreteElementB";
    }
}