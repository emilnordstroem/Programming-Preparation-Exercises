package Thread.boundedCounter;

public class IncrementThread extends Thread {
    private final BoundedCounter boundedCounter;

    public IncrementThread(BoundedCounter boundedCounter) {
        this.boundedCounter = boundedCounter;
    }

    @Override
    public void run() {
        for (int counter = 1; counter <= 25; counter++) {
            boundedCounter.increase();
            try{
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public BoundedCounter getBoundedCounter() {
        return boundedCounter;
    }
}
