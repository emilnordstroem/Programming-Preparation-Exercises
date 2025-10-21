package IteratorPattern.menu;

import java.util.List;

public class MenuIterator<E> implements Iterator<E> {
    private final List<E> elements;
    private int position = 0;

    public MenuIterator(List<E> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return position < elements.size();
    }

    @Override
    public E next() {
        E currentElement = elements.get(position);
        position++;
        return currentElement;
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not permitted to remove objects");
    }
}
