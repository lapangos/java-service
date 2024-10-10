package com.demo.service.designpattern.behavioral.memento;

public class MainClass {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();

        editor.setContent("State 1");
        caretaker.save(editor);
        System.out.println("Content: " + editor.getContent());

        editor.setContent("State 2");
        caretaker.save(editor);
        System.out.println("Content: " + editor.getContent());

        editor.setContent("State 3");
        System.out.println("Content: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("Undo: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("Undo: " + editor.getContent());
    }
}