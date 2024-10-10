package com.demo.service.designpattern.behavioral.iterator;

public class MainClass {
    public static void main(String[] args) {
        Collection<String> collection = new Collection<>();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        Iterator<String> iterator = collection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}