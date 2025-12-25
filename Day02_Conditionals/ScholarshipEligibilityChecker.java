//Q. Create Java program to determine scholarship eligibility using marks and family income criteria.

import java.util.Scanner;

class ScholarshipEligibilityChecker
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks:");

		int marks = sc.nextInt();

		System.out.println("Enter Family Income :");

		double income = sc.nextDouble();

		if(marks >= 75 && income <= 200000)
		{
			System.out.println("Eligible for Scholarship");
		}
		else
		{
			System.out.println("Not Eligible for Scholarship");
		}

		sc.close();
	}
}