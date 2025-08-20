package LinkedList.extendedLinkedList;

public class LinkedList <T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;

    public LinkedList() {}

    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if(head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void remove(T element) {
        Node<T> currentNode = head;
        while(currentNode != null){
            if(currentNode.element == element){
                if(currentNode == head && currentNode == tail){
                    head = tail = null;
                    size = 0;
                    break;
                } else if (currentNode == tail) {
                    tail = tail.previous;
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
