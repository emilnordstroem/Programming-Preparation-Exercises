package DesignPattern.ObserverPattern;

public class Main {

    public static void main(String[] args) {
        BookStore store = new BookStore();
        Observer observer = new Customer("Emil", "Non-fiction");
        Observer observer1 = new Customer("Maria", "Romance");
        store.addObserver(observer);
        store.addObserver(observer1);

        store.addBook(new Book("Introduction to Java Programming and Data Structure", "non-fiction"));

    }

}
