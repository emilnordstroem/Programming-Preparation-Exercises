package Array.circularQueue;

import java.util.NoSuchElementException;

public class Queue {
    private int[] queueElements = new int[10];
    private int firstIndex = 0;
    private int lastIndex = 0;
    private int currentSize = 0;

    public Queue() {}

    public void addLast (int takesPlaceInQueue) {
        resizeIfNeeded();
        currentSize++;
        queueElements[lastIndex] = takesPlaceInQueue;
        lastIndex = (lastIndex + 1) % queueElements.length;
    }

    public void removeFirst () {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        firstIndex = (firstIndex + 1) % queueElements.length;
        currentSize--;
    }

    public void resizeIfNeeded(){
        if (currentSize < queueElements.length) {
            return;
        }
        int[] resizedQueue = new int[queueElements.length * 2];
        for (int index = 0; index < queueElements.length; index++) {
            resizedQueue[index] = queueElements[((firstIndex + index) % queueElements.length)];
        }
        queueElements = resizedQueue;
        firstIndex = 0;
        lastIndex = currentSize;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}
