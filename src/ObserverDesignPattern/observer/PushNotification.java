package ObserverDesignPattern.observer;

import ObserverDesignPattern.subject.Observer;

import java.util.HashSet;
import java.util.Set;

public class PushNotification implements Subject {
    private final Set<Observer> observers = new HashSet<>();
    private String message;

    public PushNotification() {}

    public Set<Observer> getObservers() {
        return observers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
