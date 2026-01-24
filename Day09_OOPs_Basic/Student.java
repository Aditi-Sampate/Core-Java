import java.util.Scanner;

class Student	//Define Student Class
{
	//Method -> Behavior of Class
	void display(int roll, String name, int marks)
	{
		System.out.println("Roll No :" +roll);
		System.out.println("Name :"+name);
		System.out.println("marks :"+marks);
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter Roll No :");
		int rollNo = sc.nextInt();

		sc.nextLine();	//clear buffer

		System.out.println("Enter Name :");
		String name = sc.nextLine();

		System.out.println("Enter marks :");
		int marks = sc.nextInt();

		//Object Creation
		Student s = new Student();

		//Method call using object
		s.display(rollNo,name,marks);
	}
}


/*class -->(user defined Data Type)
i)A class is a blueprint or template used to create objects.
ii)It defines what data an object will have and what actions it can perform.
iii)A class does not use memory
iv) Memory is allocated when an object is created
v)It contains varibles and methods
Why do we use a Class?

1]To represent real-world entities
2]To organize code properly
3]To reuse code easily */