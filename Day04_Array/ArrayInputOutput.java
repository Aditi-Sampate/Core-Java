//Q.Write a java program to Store and Display Elements of an array.

import java.util.Scanner;

class ArrayInputOutput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int[]arr = new int[size];

		System.out.println("Enter Array Elements :");

		for(int i=0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are :");

		for(int i=0; i < size; i++)
		{
			System.out.println(arr[i]+"");
		}
	}
}