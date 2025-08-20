package LinkedList.iteratorLinkedList;

import java.util.Iterator;

public class LinkedList <E> implements ListEaaa<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;

    public LinkedList() {}

    @Override
    public void add(E e) {
        if(head == null){
            addFirst(e);
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
            size++;
        }
    }

    @Override
    public boolean remove(E e) {
        boolean isFound = false;
        Node<E> currentNode = head;
        Node<E> previousNode = null;

        while(currentNode != null){
            if(currentNode.element == e){
                isFound = true;
                if(currentNode == head && currentNode == tail){
                    clear();
                } else if (currentNode == head) {
                    removeFirst();
                } else if (currentNode == tail) {
                    tail = previousNode;
                    previousNode.next = null;
                    size--;
                    break;
                } else {
                    previousNode.next = currentNode.next;
                    currentNode = currentNode.next;
                    size--;
                }
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return isFound;
    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null){
            tail = head;
        }
    }

    @Override
    public E getFirst() {
        return head.element;
    }

    @Override
    public void removeFirst() {
        head = head.next;
        size--;
    }

    @Override
    public boolean contains(E e) {
        Node<E> currentElement = head;
        while(currentElement != null){
            if(currentElement.element == e){
                return true;
            }
            currentElement = currentElement.next;
        }
        return false;
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

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        return get(head, index, 0);
    }

    private E get(Node<E> currentnode, int index, int currentIndex){
        if(currentIndex == index && currentnode != null){
            return currentnode.element;
        }
        return get(currentnode.next, index, currentIndex + 1);
    }

    @Override
    public void add(int index, E e) {
        int currentIndex = 0;
        Node<E> currentElement = head;
        while(currentIndex < size){
            if(currentIndex == index){
                currentElement.element = e;
                return;
            } else if (currentElement.next != null) {
                currentElement = currentElement.next;
            }
            currentIndex++;
        }
    }

    @Override
    public E remove(int index) {
        int currentIndex = 0;
        Node<E> currentNode = head;
        Node<E> previousNode = null;

        while(currentIndex < size){
            if(currentIndex == index){
                if(previousNode == null){
                    head = head.next;
                    size--;
                    return head.element;
                } else {
                    previousNode.next = currentNode.next;
                    size--;
                    return currentNode.element;
                }
            } else {
                currentNode = currentNode.next;
                previousNode = currentNode;
                currentIndex++;
            }
        }
        return null;
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        Node<E> currentNode = head;
        while(index < size){
            if(currentNode.element == e){
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                E tempElement = currentNode.element;
                currentNode = currentNode.next;
                return tempElement;
            }
        };
    }

}
