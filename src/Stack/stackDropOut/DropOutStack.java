package Stack.stackDropOut;

import Stack.stackArrayList.StackEaaa;

public class DropOutStack<E> implements StackEaaa<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private int maxSize;

    public DropOutStack(int maxSize) {
        size = 0;
        this.maxSize = maxSize;
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        if(size == maxSize){
            head = head.next;
            head.previous = null;
            size--;
        } else if (isEmpty()) {
            head = newNode;
            tail = newNode;
            head.next = tail;
            tail.previous = head;
            size++;
            return;
        }

        Node<E> currentNode = head;
        while (currentNode != tail) {
            currentNode = currentNode.next;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        size++;
    }

    @Override
    public E pop() {
        Node<E> currentNode = head;
        while (currentNode != tail) {
            currentNode = currentNode.next;
        }
        tail = currentNode.previous;
        tail.next = null;
        size--;
        return currentNode.element;
    }

    @Override
    public E peek() {
        return tail.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        public Node(T element) {
            this.element = element;
        }
    }
}
