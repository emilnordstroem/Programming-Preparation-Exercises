package Thread.boundedCounter;

public class BoundedCounter {
    private int size;
    private final int limit;

    public BoundedCounter(int size, int limit) {
        this.size = size;
        this.limit = limit;
    }

    public synchronized void increase(){
        while (isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        size++;
        System.out.println("Increased to: " + size);
        notify();
    }

    public synchronized void decrease(){
        while (isEmpty()) {
            try {
              wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        size--;
        System.out.println("Decreades to: " + size);
        notify();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == limit;
    }

    public int getSize() {
        return size;
    }

    public int getLimit() {
        return limit;
    }
}
