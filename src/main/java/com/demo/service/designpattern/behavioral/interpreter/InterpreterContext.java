package com.demo.service.designpattern.behavioral.interpreter;

public class InterpreterContext {
    public String getBinaryFormat(int number) {
        return Integer.toBinaryString(number);
    }

    public String getHexFormat(int number) {
        return Integer.toHexString(number);
    }
}