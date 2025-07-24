import java.util.*;

interface ShoppingCartItem {
    String getName();
    int getQuantity();
    double getPrice();
}

class Item implements ShoppingCartItem {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
 class ShoppingCart<T extends Item> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item); 
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (T item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public void printCart() {
        for (T item : items) {
            System.out.println(item.getName() + " x" + item.getQuantity() + " : " + item.getPrice());
        }
        System.out.println("Total: " + getTotalPrice());
    }
}


public class Shopping {
    public static void main(String[] args) {
        ShoppingCart<Item> cart = new ShoppingCart<>();

        cart.addItem(new Item("shirt", 2, 1000));
        cart.addItem(new Item("jeans", 3, 1500));
        cart.addItem(new Item("cap", 1, 500));

        System.out.println("Items in the cart:");
        cart.printCart();

        // System.out.println("\nRemoving jeans...");
        // cart.removeItem(new Item("jeans", 3, 1500));

        // System.out.println("\nItems in the cart after removal:");
        // cart.printCart();
    }

}
