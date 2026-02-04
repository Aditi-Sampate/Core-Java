/* Used Methods :-
1.add(value)
2.add(index,value)
3.get(index)
4.update(index,value)
5.remove(value)
6.remove(index)
*/


import java.util.List;

public class ArrayList {
	
	public static void main(String[] args) {
		
		List<String> students = new java.util.ArrayList<>();
	
		//Added Elements by using add(value) 
		students.add("Prachi");
		students.add("Komal");
		students.add("Aditi");
		students.add("Shraddha");
		
		System.out.println(students); //all added element 
		
		//Added by using add(index , value) 
		students.add(0, "Sakshi");
		students.add(5, "Priya");
		
		//Access element by using index with get(index) method
		System.out.println("Element at Index 1 = " + students.get(1)); 
		System.out.println("Element at Index 2 = " + students.get(2)); 
		System.out.println("All updated Array List =" +students); 
		
		
		//Update(index,value)
		students.set(5, "Riya");
		students.set(2, "Shiv");
		System.out.println("updated element at index 5  = "+students);
		System.out.println("updated element at index 2  = "+students);
		
		
		//Remove Element remove(value)
		students.remove("Riya");
		System.out.println("Remove Riya from array list =" +students);
		
		//Remove Element remove(index)
		students.remove(1);
		System.out.println("Remove from index = "+students);
		
		//Add Duplicate elements  add(values)
		students.add("Sakshi");
		students.add("Aditi");
		students.add("Komal");
		System.out.println("Duplicate elements added= " +students);
		
		//Add null values add(null) and add(index,null)
		students.add(null);
		students.add(1, null);
		System.out.println("Added null value= " +students);
	}
}
