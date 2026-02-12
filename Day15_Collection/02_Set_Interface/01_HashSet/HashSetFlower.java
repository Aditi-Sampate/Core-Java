import java.util.HashSet;
import java.util.Set;

public class HashSetFlower {
    public static void main(String[] args) {

        Set<String> setA = new HashSet<>();
        
        setA.add("Rose");
        setA.add("Lily");

        Set<String> setB = new HashSet<>();
        
        setB.add("Lily");
        setB.add("Mogra");

        setA.addAll(setB);

        System.out.println("List of Flowers: " + setA);
    }
}