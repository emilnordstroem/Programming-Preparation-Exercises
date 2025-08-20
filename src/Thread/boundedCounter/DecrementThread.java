package Thread.boundedCounter;

public class DecrementThread extends Thread {
    private final BoundedCounter boundedCounter;

    public DecrementThread(BoundedCounter boundedCounter) {
        this.boundedCounter = boundedCounter;
    }

    @Override
    public void run() {
        for (int counter = 1; counter <= 25; counter++) {
            boundedCounter.decrease();
            try{
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public BoundedCounter getBoundedCounter() {
        return boundedCounter;
    }

}
