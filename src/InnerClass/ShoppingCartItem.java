package InnerClass;

import java.util.Collection;
import java.util.HashSet;

public class ShoppingCartItem {
    private final Collection<Item> cartItems;

    public ShoppingCartItem() {
        cartItems = new HashSet<>();
    }

    public void createCartItem(String name, int quantity){
        Item newItem = new Item(name, quantity);
        cartItems.add(newItem);
    }

    public void printCartItems(){
        for (Item cartItem : cartItems) {
            System.out.println(cartItem);
        }
    }

    public class Item {
        private final String name;
        private final int quantity;

        public Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }
}
