package DesignPattern.ObserverPattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObservers(Book book);
}
