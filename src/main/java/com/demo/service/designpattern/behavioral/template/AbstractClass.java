package com.demo.service.designpattern.behavioral.template;

public abstract class AbstractClass {
    // Template method
    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    protected abstract void stepOne();
    protected abstract void stepTwo();
    protected abstract void stepThree();
}