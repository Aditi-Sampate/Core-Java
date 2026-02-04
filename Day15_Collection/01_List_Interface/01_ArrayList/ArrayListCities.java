import java.util.ArrayList;
import java.util.List;

public class ArrayListCities
{
	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();

		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nagpur \n");

		System.out.println(cities);

		//Add at index
		cities.add(1, "Nanded");
		System.out.println("After adding Nanded:"+cities);

		//get by index
		System.out.println("City at index 0 : "+cities.get(0));

		//update
		cities.set(2, "Aurangabad");
		System.out.println("After update: "+cities);

		//remove by value
		cities.remove("Mumbai");
		System.out.println("After removing Mumbai: "+cities);

		//duplicate value
		cities.add("Pune");
		System.out.println("After adding duplicate: "+cities);

		//null value
		cities.add(null);
		System.out.println("After adding null: "+cities);
	}
}