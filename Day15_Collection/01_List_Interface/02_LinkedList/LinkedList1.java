/*
 *used Method:-
 *1.Add(values)
 *2.add(index, values)
 *3.addFirst(value)
 *4.addLast(value)
 *5.Set(index,value)
 *6.getFirst()
 *7.getLast()
 *8.get(index)
 *9.remove(value)
 *10.remove(index)
 *11.removeFirst()
 *12.removeLast()
 */

import java.util.List;
import java.util.LinkedList;

public class LinkedList1
{
	
	public static void main(String[] args) {
		
		List<String> cities= new LinkedList<>();
		
		//Add(values)
		cities.add("Latur");
		cities.add("Pune");
		cities.add("Nanded");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Solapur");
		cities.add("Dharashiv");
		
		System.out.println(cities);
		
		//add(index, values)
		cities.add(0, "Delhi");
		cities.add(1, "Gao");
		
		System.out.println("Cities added by index="+cities);
		
		
		//addFirst(value)
		cities.addFirst("Hyderabad");
		System.out.println("Add first ="+cities);
		
		//addLast(value)
		cities.addLast("Bangalore");
		System.out.println("Add Last ="+cities);
		
		
		//Set(index,value)
		cities.set(1, "Nagpur");
		System.out.println("update the value of index 1 ="+cities );
		
		//getFirst()
		System.out.println("Get First Element=" +cities.getFirst());
		
		//getLast()
		System.out.println("Get Last Element= "+cities.getLast());
		
		//get(index)
		System.out.println("Get by index =" +cities.get(5));
		
		//Remove element
		//remove(value)
		cities.remove("Latur");
		System.out.println("Remove the latur form list" +cities);
		
		//remove(index)
		cities.remove(2);
		System.out.println("Remove index 2 from list =" +cities);
		
		//removeFirst()
		cities.removeFirst();
		System.out.println("Remove first Element = " +cities);
		
		//removeLast()
		cities.removeLast();
		System.out.println("Remove Last Element= " +cities);
	}

}