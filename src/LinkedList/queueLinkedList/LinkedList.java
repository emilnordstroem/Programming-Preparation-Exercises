package LinkedList.queueLinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {}

    public void addLast(String data){
        Node newNode = new Node(data);
        if (first == null || last == null) {
            first = last = newNode;
        } else if (first == last) {
            last = newNode;
            first.setNext(last);
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public String removeFirst(){
        if (first == null || last == null) {
            throw new NoSuchElementException();
        }
        String data = first.getData();
        if (first == last) {
            first = last = null;
        } else {
            first = first.getNext();
        }
        return data;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }
}
