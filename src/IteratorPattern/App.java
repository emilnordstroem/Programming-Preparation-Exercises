package IteratorPattern;

import IteratorPattern.menu.ConcreteMenu;
import IteratorPattern.menu.Menu;
import IteratorPattern.menu.MenuItem;
import IteratorPattern.menu.Waitress;

public class App {

    public static void main(String[] args) {
        Menu currentMenu = new ConcreteMenu();
        MenuItem[] menuItems = {
                new MenuItem("Burger", "No Description Needed", 19.99),
                new MenuItem("Salat", "Just don't", 9.89),
                new MenuItem("Fries", "Because we don't give you anything for free", 7.50)
        };
        for (MenuItem menuItem : menuItems) {
            currentMenu.addMenuItem(menuItem);
        }
        Waitress waitressAtWork = new Waitress(currentMenu);
        waitressAtWork.printMenu();
    }

}
