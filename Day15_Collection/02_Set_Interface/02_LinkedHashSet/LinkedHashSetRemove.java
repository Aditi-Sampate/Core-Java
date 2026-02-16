import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetRemove 
{
    public static void main(String[] args) {

        Set<String> cities = new LinkedHashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nagpur");
        cities.add("Delhi");

        cities.remove("Mumbai");

        System.out.println(cities);
    }
}