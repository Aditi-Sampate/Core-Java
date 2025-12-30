//Write a Java program to count even and odd numbers in an array.

import java.util.Scanner;

class EvenOddCount1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		int even = 0;
		int odd = 0;

		System.out.println("Enter Array Elements:");

		for(int i = 0; i < size ; i++)
		{
			arr[i] = sc.nextInt();

			if(arr[i] % 2 == 0)
			{
				even ++;
			}
			else
			{
				odd ++;
			}
		}

		System.out.println("Even Number Count = " +even);
		System.out.println("Odd Number Count = "+odd);
	}
}