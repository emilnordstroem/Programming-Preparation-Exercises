package IteratorPattern.menu;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMenu implements Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    public ConcreteMenu() {}

    @Override
    public void addMenuItem(MenuItem menuItem) {
        if (!menuItems.contains(menuItem)) {
            menuItems.add(menuItem);
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new MenuIterator<>(menuItems);
    }

}
