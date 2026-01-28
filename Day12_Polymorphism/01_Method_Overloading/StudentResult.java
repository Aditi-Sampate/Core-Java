import java.util.Scanner;

class StudentResult
{
	double calculate(int m1 , int m2)
	{
		return (m1 + m2) / 2.0;
	}

	double calculate(int m1, int m2, int m3)
	{
		return (m1 + m2 + m3) / 3.0;
	}

	double calculate(int m1 , int m2, int m3, int m4)
	{
		return (m1 + m2 + m3 + m4) / 4.0;
	}

	double calculate(int m1, int m2, int m3, int m4, int m5)
	{
		return (m1 + m2 + m3 + m4 + m5) / 5.0;
	}

	double calculate(int m1, int m2, int m3, int m4, int m5, int m6)
	{
		return (m1 + m2 + m3 + m4 + m5 + m6 ) / 6.0;
	}

	String grade(double percentage)
	{
		if(percentage >= 75)
		{
			return "Distinction" ;
		}
		else if(percentage >= 60)
		{
			return "First Class";
		}
		else 
		{
			return " Pass";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentResult s= new StudentResult();

		System.out.println("Enter Number of Subjects (2,3,4,5,6): ");
		int n = sc.nextInt();

		double percentage = 0;

		if(n == 2)
		{	
			System.out.println("Enter Marks:");
			int sub1 = sc.nextInt();
			int sub2 = sc.nextInt();
		 	percentage = s.calculate(sub1, sub2);
		}

		else if(n == 3)
		{
			System.out.println("Enter Marks:");
			int sub1 = sc.nextInt();
			int sub2 = sc.nextInt();
		 	int sub3 = sc.nextInt();
		 	percentage = s.calculate(sub1, sub2,sub3);
		}

		else if( n == 4)
		{
			System.out.println("Enter Marks:");
			int sub1 = sc.nextInt();
			int sub2 = sc.nextInt();
		 	int sub3 = sc.nextInt();
		 	int sub4 = sc.nextInt();
		 	percentage = s.calculate(sub1, sub2, sub3, sub4);
		}

		else if( n == 5)
		{
			System.out.println("Enter Marks:");
			int sub1 = sc.nextInt();
			int sub2 = sc.nextInt();
		 	int sub3 = sc.nextInt();
		 	int sub4 = sc.nextInt();
		 	int sub5 = sc.nextInt();
		 	percentage = s.calculate(sub1, sub2, sub3, sub4, sub5);
		}


		else if( n == 6)
		{
			System.out.println("Enter Marks:");
			int sub1 = sc.nextInt();
			int sub2 = sc.nextInt();
		 	int sub3 = sc.nextInt();
		 	int sub4 = sc.nextInt();
		 	int sub5 = sc.nextInt();
		 	int sub6 = sc.nextInt();
		 	percentage = s.calculate(sub1, sub2, sub3, sub4, sub5, sub6);
		}

		else
		{
			System.out.println("Invalid Subject Count");
			return;
		}


		System.out.println("percentage: " + percentage);
		System.out.println("Grade: "+ s.grade(percentage));

	}
}