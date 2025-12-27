//Q.Created Armstrong number validation program.

import java.util.Scanner;

class ArmstrongNumberChecker
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;

		while(temp > 0)
		{
			int digit = temp %10;	//get last digit of number

			sum = sum + (digit * digit * digit);	//add cube of digit to sum 

			temp = temp / 10;	//remove last digit from number.
		}
		if(sum == num)
		{
			System.out.println("ArmStrongNumber");
		}
		else
		{
			System.out.println("Not an ArmStrongNumber Number");
		}

		sc.close();
	}
}