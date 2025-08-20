package LinkedList.fixedCircularLinkedList;

public class Node <T> {
    private T element;
    private Node<T> nextNode;
    private Node<T> previousNode;

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }

}
