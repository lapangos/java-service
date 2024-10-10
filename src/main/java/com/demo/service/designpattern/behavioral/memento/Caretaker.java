package com.demo.service.designpattern.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    public void save(Editor editor) {
        mementoStack.push(editor.save());
    }

    public void undo(Editor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop());
        } else {
            System.out.println("No states to undo.");
        }
    }
}