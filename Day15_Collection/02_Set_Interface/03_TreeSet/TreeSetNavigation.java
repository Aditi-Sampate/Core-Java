import java.util.TreeSet;

public class TreeSetNavigation 
{
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Higher than 20: " + numbers.higher(20));
        System.out.println("Lower than 30: " + numbers.lower(30));
    }
}