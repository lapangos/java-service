package com.demo.service.designpattern.behavioral.interpreter;

public class IntToHexExpression implements Expression {
    private int number;

    public IntToHexExpression(int number) {
        this.number = number;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getHexFormat(number);
    }
}