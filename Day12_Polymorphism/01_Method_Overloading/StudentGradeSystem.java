import java.util.Scanner;

class StudentGradeSystem
{
	// Overloaded Methods for Percentage Calculation
	double calculatePercentage(int m1, int m2)
	{
		return (m1 + m2) / 2.0;
	}

	double calculatePercentage(int m1, int m2, int m3)
	{
		return (m1 + m2 + m3) / 3.0;
	}

	double calculatePercentage(int m1, int m2, int m3, int m4)
	{
		return (m1 + m2 + m3 + m4) / 4.0;
	}

	double calculatePercentage(int m1, int m2, int m3, int m4, int m5)
	{
		return (m1 + m2 + m3 + m4 + m5) / 5.0;
	}

	double calculatePercentage(int m1, int m2, int m3, int m4, int m5, int m6)
	{
		return (m1 + m2 + m3 + m4 + m5 + m6) / 6.0;
	}

	// Grade Logic
	String getGrade(double percentage)
	{
		if(percentage >= 75)
		{
			return "Distinction";
		}
		else if (percentage >= 60)
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

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		StudentGradeSystem s = new StudentGradeSystem();

		System.out.println("Enter Number Of Subjects (2 to 6): ");
		int choice = sc.nextInt();

		double percentage = 0;

		switch(choice) 
		{
			case 2:
				System.out.println("Enter Marks :");
				percentage = s.calculatePercentage(sc.nextInt(),sc.nextInt());
				break;

			case 3 :
				System.out.println("Enter Marks :");
				percentage = s.calculatePercentage(sc.nextInt(),sc.nextInt(),sc.nextInt());
				break;

			case 4 :
				System.out.println("Enter Marks :");
				percentage = s.calculatePercentage(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
				break;
	
			case 5:
				System.out.println("Enter Marks :");
				percentage = s.calculatePercentage(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
				break;


			case 6 :
				
				percentage = s.calculatePercentage(sc.nextInt(),sc.nextInt(),sc.nextInt(),
													sc.nextInt(),sc.nextInt(),sc.nextInt());
				break;

			default:
				System.out.println("Invalid Subject Count");
				return;
		}

		System.out.println("Percentage :"+percentage);
		System.out.println("Grade :"+s.getGrade(percentage));

	}

}