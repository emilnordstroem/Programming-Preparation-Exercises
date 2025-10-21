package IteratorPattern.menu;

public interface Menu {
    void addMenuItem(MenuItem menuItem);
    Iterator<MenuItem> createIterator();
}
