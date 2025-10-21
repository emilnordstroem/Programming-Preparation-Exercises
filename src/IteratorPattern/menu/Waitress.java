package IteratorPattern.menu;

public class Waitress {
    Menu concreteMenu;

    public Waitress(Menu concreteMenu) {
        this.concreteMenu = concreteMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> concreteMenuIterator = concreteMenu.createIterator();
        System.out.println("Menu:");
        printMenu(concreteMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()) {
            MenuItem currentMenuItem = iterator.next();
            System.out.println(String.format("-----%n%s%n%s%nPrice: %.2f%n",
                    currentMenuItem.getTitle(),
                    currentMenuItem.getDescription(),
                    currentMenuItem.getPrice()
            ));
        }
    }

}
