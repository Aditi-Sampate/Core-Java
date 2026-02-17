import java.util.TreeSet;

public class TreeSetDescending {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        System.out.println("Ascending: " + numbers);
        System.out.println("Descending: " + numbers.descendingSet());
    }
}