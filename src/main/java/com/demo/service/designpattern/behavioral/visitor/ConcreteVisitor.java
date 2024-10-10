package com.demo.service.designpattern.behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting " + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting " + elementB.operationB());
    }
}