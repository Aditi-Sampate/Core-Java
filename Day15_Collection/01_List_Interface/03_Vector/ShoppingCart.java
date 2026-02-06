import java.util.Vector;

public class ShoppingCart {

    public static void main(String[] args) {

        Vector<String> cart = new Vector<>();

        // Add products
        cart.add("Mobile");
        cart.add("Laptop");
        cart.add("Headphones");

        System.out.println("Shopping Cart:");
        System.out.println(cart);

        // Remove product
        cart.remove("Laptop");

        System.out.println("\nAfter Removing Product:");
        System.out.println(cart);

        // Total items
        System.out.println("Total Items: " + cart.size());
    }
}