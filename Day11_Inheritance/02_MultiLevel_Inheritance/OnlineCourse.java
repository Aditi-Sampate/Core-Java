import java.util.Scanner;

class Platform
{
	String platformName;

	void setPlatform(String name)
	{
		this.platformName = name;
	}
}

class Course extends Platform
{
	String courseName;
	double price;

	void setCourse(String cName, double price)
	{
		this.courseName = cName;
		this.price = price;
	}
}

class OnlineCourse extends Course
{
	int duration;

	void setDuration(int hours)
	{
		duration = hours;
	}
	void display()
	{
		System.out.println("Platform Name :"+platformName);
		System.out.println("Course Name :"+courseName);
		System.out.println("Duration :"+duration + "hours");
		System.out.println("Price :"+price);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		OnlineCourse oc = new OnlineCourse();

		System.out.println("Enter Platform Name :");
		oc.setPlatform(sc.nextLine());

		System.out.println("Enter Course Name :");
		String cname = sc.nextLine();

		System.out.println("Enter Course Price :");
		double price = sc.nextDouble();

		System.out.println("Enter Course Duration (hours) :");
		int duration = sc.nextInt();

		oc.setCourse(cname, price);
		oc.setDuration(duration);

		System.out.println("\n---- E-Learning Course Details ----");
		oc.display();
		
	}
}