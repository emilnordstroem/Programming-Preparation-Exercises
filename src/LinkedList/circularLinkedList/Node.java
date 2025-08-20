package LinkedList.circularLinkedList;

public class Node <T> {
    T element;
    Node<T> next;
    Node<T> previous;

    public Node(T element) {
        this.element = element;
    }
}
