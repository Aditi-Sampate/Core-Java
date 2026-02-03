import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListCode
{
	public static void main(String[] args) 
	{
		List<String> courses = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		//number of courses
		System.out.println("Enter Number of Courses :");
		int n = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Course Name :");

		//add courses
		for(int i= 0; i<n; i++)
		{
			courses.add(sc.nextLine());
		}

		//insert DSA at index 1
		courses.add(1,"DSA");

		//Print List
		System.out.println("Courses :"+courses);

		//get element
		System.out.println("Courses at index 2 :"+courses.get(2));

		//update first element
		System.out.println("\n Contains Java :"+courses.contains("Java"));

		//Remove Python
		courses.remove("Python");

		//Final list 
		System.out.println("\n Final List :"+courses);

		sc.close();
		
	}
}