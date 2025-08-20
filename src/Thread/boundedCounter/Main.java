package Thread.boundedCounter;

public class Main {

    public static void main(String[] args) {
        BoundedCounter sharedResource = new BoundedCounter(0, 25);
        IncrementThread increment = new IncrementThread(sharedResource);
        DecrementThread decrement = new DecrementThread(sharedResource);

        increment.start();
        decrement.start();

        try {
            increment.join();
            decrement.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sharedResource.getSize());
    }

}
