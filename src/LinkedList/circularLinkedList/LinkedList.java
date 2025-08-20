package LinkedList.circularLinkedList;

public class LinkedList <T> {
    Node<T> head;
    int size = 0;

    public LinkedList() {}

    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if(head == null) {
            head = newNode;
            head.previous = newNode;
            newNode.next = newNode;
        } else if (head.previous == head) {
            head.previous = newNode;
            head.next = newNode;
            newNode.previous = head;
            newNode.next = head;
        } else {
            head.previous.next = newNode;
            newNode.previous = head.previous;
            head.previous = newNode;
            newNode.next = head;
        }
        size++;
    }

    public void remove(T element){
        Node<T> currentNode = head;
        while (currentNode.next != currentNode || size > 0) {
            if(currentNode.next == currentNode.previous
                    && currentNode.element != element && currentNode.previous.element != element){
                break;
            }
            if(currentNode.element == element) {
                if (currentNode == head) {
                    currentNode.next.previous = currentNode.previous;
                    currentNode.previous.next = currentNode.next;
                    head = currentNode.next;
                } else {
                    currentNode.previous.next = currentNode.next;
                    currentNode.next.previous = currentNode.previous;
                }
                size--;
            }
            currentNode = currentNode.next;
        }

    }

    public int size(){
        return size;
    }

}