//Q. Create the program of Count the Number Of Digits.

import java.util.Scanner;

class CountDigits
{
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter Number :");
		 int num = sc.nextInt();

		 int count = 0;

		 while(num > 0)
		 {
		 	count++;
		 	num = num / 10;
		 }
		 System.out.println("Total Digits :"+count);
		 sc.close();
	}
}