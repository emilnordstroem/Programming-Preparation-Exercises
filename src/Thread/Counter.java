package Thread;

public class Counter extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Counter newCounter = new Counter();
        counter.start();
        newCounter.start();
    }

    public Counter(){
    }

    @Override
    public void run(){
        for(int number = 1; number <= 10; number++){
            System.out.println(number);
        }
    }
}