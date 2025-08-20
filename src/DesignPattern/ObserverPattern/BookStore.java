package DesignPattern.ObserverPattern;

import java.util.Collection;
import java.util.HashSet;

public class BookStore implements Subject {
    private final Collection<Book> bookCollection;
    private final Collection<Observer> observers;

    public BookStore() {
        bookCollection = new HashSet<>();
        observers = new HashSet<>();
    }

    public void addBook(Book book){
        bookCollection.add(book);
        updateObservers(book);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers(Book book) {
        for (Observer observer : observers) {
            observer.notify(book);
        }
    }

    public Collection<Book> getBookCollection() {
        return bookCollection;
    }

    public Collection<Observer> getObservers() {
        return observers;
    }

}
