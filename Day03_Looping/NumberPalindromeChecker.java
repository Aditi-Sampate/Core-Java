//Q.Created program to verify palindrome numbers.


import java.util.Scanner;

class NumberPalindromeChecker
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int num = sc.nextInt();

		int original = num,reverse =0;

		while(num > 0)
		{
			reverse = reverse * 10 + (num % 10);
			num = num/10;
		}
		if(reverse == original)
		{
			System.out.println("Palindrome Number :");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

		sc.close();
	}
}