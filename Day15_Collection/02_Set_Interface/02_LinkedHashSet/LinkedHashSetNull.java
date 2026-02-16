import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetNull 
{

    public static void main(String[] args) {

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(null);
        numbers.add(20);
        numbers.add(null); // ignored

        System.out.println(numbers);
    }
}