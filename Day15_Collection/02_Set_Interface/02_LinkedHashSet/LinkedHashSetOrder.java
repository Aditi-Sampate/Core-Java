import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetOrder {

    public static void main(String[] args) {

        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate

        System.out.println(fruits);

    }
}