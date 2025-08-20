package Stack.stackArrayList;

import java.util.NoSuchElementException;

public class LinkedStack<E> implements StackEaaa<E> {
    private Node<E> top;
    private int size = 0;
    @Override
    public void push(E element) {
        top = new Node<>(element, top);
        size++;
    }

    @Override
    public E pop() {
        throwIfEmpty();
        E element = top.element;
        top = top.next;
        size--;
        return element;
    }


    @Override
    public E peek() {
        throwIfEmpty();
        return top.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    private void throwIfEmpty() {
        if (top == null) {
            throw new NoSuchElementException("Stack is empty");
        }
    }
}
