// HashSet allows:
// - NO duplicates
// - ONLY ONE null
// - NO insertion order

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> data = new HashSet<>();

        // duplicate values
        data.add("Java");
        data.add("Java");

        // null values
        data.add(null);
        data.add(null);

        // insertion order tests
        data.add("Python");
        data.add("C");
        data.add("Go");

        System.out.println(data);
    }
}