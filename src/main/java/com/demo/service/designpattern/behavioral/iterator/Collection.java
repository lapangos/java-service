package com.demo.service.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Collection<T> implements Container<T> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> getIterator() {
        return new CollectionIterator();
    }

    private class CollectionIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public T next() {
            if (this.hasNext()) {
                return items.get(index++);
            }
            return null;
        }
    }
}