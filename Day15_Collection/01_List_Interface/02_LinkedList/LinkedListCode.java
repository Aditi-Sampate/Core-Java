import java.util.LinkedList;

class LinkedListCode
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();

		System.out.println("List of My Friends");

		//add (element) -> adds element at the end of list
		list.add("Prachi");
        list.add("Aditi");
        list.add("Komal");
        list.add("Shraddha");
        list.add("Sakshi");		

        //Print all elements of LinkedList
        System.out.println(list);

        //Create another LinkedList for subjects
        LinkedList<String> list1 = new LinkedList<>();

        //add(element) → adds subject names
        list1.add("Math");
        list1.add("English");
        list1.add("Science");
        list1.add("Sanskrit");
        list1.add("Marathi");

        System.out.println("\nList of Subject:");
        System.out.println(list1);

        // addFirst(element) → adds element at beginning
        list.addFirst("Sanika");

        // addLast(element) → adds element at end
        list.addLast("Pratiksha");

        // remove(Object) → removes specified element
        list.remove("Prachi");
        list.remove("Sakshi");

        System.out.println("\nAfter LinkedList operations on Friends");
        System.out.println(list);

        
	}
}