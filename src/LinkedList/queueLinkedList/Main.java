package LinkedList.queueLinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList queue = new LinkedList();

        queue.addLast("1");
        System.out.println(queue.getFirst().getData());
        System.out.println(queue.getLast().getData());
        System.out.println();
        queue.addLast("2");
        System.out.println(queue.getFirst().getData());
        System.out.println(queue.getLast().getData());
        System.out.println();
        queue.removeFirst();
        System.out.println(queue.getFirst().getData());
        System.out.println(queue.getLast().getData());

    }

}
