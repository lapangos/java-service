package com.demo.service.designpattern.behavioral.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "ConcreteElementA";
    }
}