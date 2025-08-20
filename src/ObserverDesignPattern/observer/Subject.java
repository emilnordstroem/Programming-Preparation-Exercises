package ObserverDesignPattern.observer;

import ObserverDesignPattern.subject.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObservers();
}
