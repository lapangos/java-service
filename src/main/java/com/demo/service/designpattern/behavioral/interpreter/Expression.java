package com.demo.service.designpattern.behavioral.interpreter;

public interface Expression {
    String interpret(InterpreterContext context);
}