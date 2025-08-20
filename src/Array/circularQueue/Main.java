package Array.circularQueue;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.addLast(1);
        queue.addLast(2);
        System.out.println(queue.getFirstIndex() + " " + queue.getLastIndex());
        System.out.println("Size:" + queue.getCurrentSize());
        queue.addLast(3);
        queue.addLast(4);
        System.out.println(queue.getFirstIndex() + " " + queue.getLastIndex());
        System.out.println("Size:" + queue.getCurrentSize());
        queue.removeFirst();
        System.out.println(queue.getFirstIndex() + " " + queue.getLastIndex());
        System.out.println("Size:" + queue.getCurrentSize());
    }

}
