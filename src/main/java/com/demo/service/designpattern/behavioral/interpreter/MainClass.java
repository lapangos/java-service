package com.demo.service.designpattern.behavioral.interpreter;

public class MainClass {
    public static void main(String[] args) {
        InterpreterContext context = new InterpreterContext();

        Expression binaryExpression = new IntToBinaryExpression(28);
        Expression hexExpression = new IntToHexExpression(28);

        System.out.println("Binary representation of 28: " + binaryExpression.interpret(context));
        System.out.println("Hexadecimal representation of 28: " + hexExpression.interpret(context));
    }
}