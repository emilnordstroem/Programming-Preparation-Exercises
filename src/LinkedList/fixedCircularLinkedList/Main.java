package LinkedList.fixedCircularLinkedList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>(10);
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(5);
        System.out.println("Current size: " + integerLinkedList.size());
        integerLinkedList.remove(2);
        System.out.println("Current size: " + integerLinkedList.size());

        Iterator<Integer> integerIterator = integerLinkedList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

    }

}
