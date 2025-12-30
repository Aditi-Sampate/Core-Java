//Q.Write a Java program to store student marks and calculate total & average.

import java.util.Scanner;

class StudentMarks
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int marks[] = new int [5];
		int total = 0;

		System.out.println("Enter Marks of 5 Subjects :");

		for(int i=0; i<5; i++)
		{
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}

		double average = total * 100/500;

		System.out.println("Total ="+total);

		System.out.println("Average = "+average);
	}
}