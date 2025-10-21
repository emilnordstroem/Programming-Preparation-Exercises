package IteratorPattern.menu;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    E remove();
}
