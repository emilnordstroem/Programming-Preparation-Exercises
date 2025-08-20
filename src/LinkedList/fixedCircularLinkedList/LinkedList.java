package LinkedList.fixedCircularLinkedList;

import java.util.Iterator;

public class LinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    private final int capacity;

    public LinkedList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T element){
        if (size == capacity) {
            return;
        }
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            head = tail = newNode;
            tail.setNextNode(head);
            head.setPreviousNode(tail);
        } else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
            tail.setNextNode(head);
            head.setPreviousNode(tail);
        }
        size++;
    }

    public void remove(T element) {
        if (size == 0) {
            return;
        }
        Node<T> currentNode = head;
        int nodeCounter = 0;
        while (nodeCounter != capacity) {
            if (currentNode.getElement().equals(element)) {
                currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
                currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
                size--;
            }
            currentNode = currentNode.getNextNode();
            nodeCounter++;
        }
    }

    public int size(){
        return size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = head;
            int currentPosition = 0;

            @Override
            public boolean hasNext() {
                return currentPosition != size;
            }

            @Override
            public T next() {
                Node<T> proxy = currentNode;
                currentPosition++;
                currentNode = currentNode.getNextNode();
                return proxy.getElement();
            }
        };
    }


}
