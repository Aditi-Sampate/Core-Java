import java.util.Scanner;

abstract class Course{
	String courseName;
	double price;

	abstract void enroll(String studentName);

	void showCourse(){
		System.out.println("Course :"+courseName+"| Price : $"+price);
	}
}

class OnlineCourse extends Course{

	@Override
	void enroll(String studentName){
		System.out.println(studentName +"enrolled Successfully in "+courseName);
	}
}

class ELearning
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		OnlineCourse course = new OnlineCourse();

		System.out.println("Enter Course Name :");
		course.courseName = sc.nextLine();

		System.out.println("Enter Course Price :");
		course.price = sc.nextDouble();

		sc.nextLine();

		System.out.println("Enter Student Name :");
		String student = sc.nextLine();

		course.enroll(student);
		course.showCourse();
	}
}