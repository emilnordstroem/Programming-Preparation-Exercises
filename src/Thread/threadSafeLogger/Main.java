package Thread.threadSafeLogger;

public class Main {

    public static void main(String[] args) {

        Logger consoleLogger = new Logger();
        logThread thread1 = new logThread("Thread1", consoleLogger);
        logThread thread2 = new logThread("Thread2", consoleLogger);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
