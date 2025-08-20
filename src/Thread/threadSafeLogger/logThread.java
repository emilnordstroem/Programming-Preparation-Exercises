package Thread.threadSafeLogger;

public class logThread extends Thread {
    private final String identifier;
    private final Logger logger;

    public logThread(String identifier, Logger logger) {
        this.identifier = identifier;
        this.logger = logger;
    }

    @Override
    public void run() {
        for (int messageCounter = 1; messageCounter <= 5; messageCounter++) {
            logger.logToConsole(identifier, String.valueOf(messageCounter));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public Logger getLogger() {
        return logger;
    }
}
