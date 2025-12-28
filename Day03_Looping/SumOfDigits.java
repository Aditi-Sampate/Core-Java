//Q.Write a program to Calculate the Sum of Digits.

import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int num = sc.nextInt();

		int sum = 0;

		do
		{
			sum = sum + (num % 10);
			num = num / 10;
		}
		while(num >0);

		System.out.println("Sum Of Digits :"+sum);
		sc.close();
	}
}