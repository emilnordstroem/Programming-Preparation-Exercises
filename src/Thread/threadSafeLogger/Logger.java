package Thread.threadSafeLogger;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Logger {

    public Logger() {}

    public synchronized void logToConsole(String identifier, String message){
        System.out.printf("[%s] %s : %s%n",
                LocalTime.now(),
                identifier,
                message);
        notifyAll();
    }

}
