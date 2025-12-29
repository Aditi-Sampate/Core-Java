//Q.Write a java program to find the Smallest element in an array.

import java.util.Scanner;

class MinElement
{
	public static void main(String[] args) 
	{
		//int []arr = {10,45,34,56,23};
		//int min = arr[0];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Element :");
		int n = sc.nextInt();

		int []arr = new int[n];

		System.out.println("Enter array Element : ");
		for(int i= 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int min = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum Element :" +min);
	}
}