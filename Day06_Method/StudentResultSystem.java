import java.util.Scanner;

class StudentResultSystem{

	static String getGrade(double percentage)
	{
		if(percentage >= 75)
		{
			return "Distinction";
		}
		else if (percentage >=60) 
		{
			return "First Class";	
		}
		else if(percentage >= 50)
		{
			return "Second Class";
		}
		else if(percentage >= 35)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}

	static int calculateTotal(int []marks)
	{
		int total = 0;

		for(int i=0; i<marks.length; i++)
		{
			total = total + marks[i];
		}
		return total;
	}

	static double calculatePercentage(int total,int subjects)
	{
		return (double)total/subjects;
	}

	static void displayResult(String name,int total,double percentage,String grade)
	{
		System.out.println("\n-----Student Result------");
		System.out.println("Name :"+name);
		System.out.println("Total Marks :"+total);
		System.out.println("percentage :"+percentage);
		System.out.println("Grade :"+grade);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name :");
		String name = sc.nextLine();

		System.out.println("Enter Number of Subjects :");
		int subjects = sc.nextInt();

		int []marks = new int[subjects];

		System.out.println("Enter Marks :");

		for(int i=0; i<subjects; i++)
		{
			marks[i] = sc.nextInt();
		}

		int total = calculateTotal(marks);
		double percentage = calculatePercentage(total,subjects);
		String grade = getGrade(percentage);

		displayResult(name,total,percentage,grade);

		sc.close();
	}
}
