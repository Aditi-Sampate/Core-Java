import java.util.Scanner;

class Person
{
	String name;
	int age;

	void setPerson(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

class Teacher extends Person
{
	String subject;
	double salary;
	char grade;

	void setTeacher(String subject,double salary)
	{
		this.subject = subject;
		this.salary = salary;
	}

	void calculateGrade(int rating)
	{
		if(rating >= 90)
		{
			grade = 'A';
		}
		else if(rating >= 75)
		{
			grade = 'B';
		}
		else if(rating >= 60)
		{
			grade = 'C';
		}
		else
		{
			grade = 'D';
		}
	}

	void applyIncrement()
	{
		if(grade == 'A')
		{
			salary = salary * 0.20;
		}
		else if(grade == 'B')
		{
			salary = salary * 0.10;
		}
		else if(grade == 'C')
		{
			salary = salary * 0.05;
		}
	}

	void display()
	{
		System.out.println("\n-----Teacher Details-----");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("subject: "+subject);
		System.out.println("Grade: "+grade);
		System.out.println("Final Salary: "+salary);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Teacher t = new Teacher();


        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Base Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Performance Rating (0-100): ");
        int rating = sc.nextInt();

        t.setPerson(name, age);
        t.setTeacher(subject, salary);
        t.calculateGrade(rating);
        t.applyIncrement();
        t.display();

	}	
}

