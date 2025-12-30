//Q.Write a java program to search an element using linear serach.

import java.util.Scanner;

class LinearSearch{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int []arr = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Array Elements is :10,20,30,40,50,60,70,80,90,100");

		System.out.println("Enter Element to Search to index :");
		int key = sc.nextInt();

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				System.out.println("Element found at index "+i);
				return;
			}
		}

		System.out.println("Element not Found");
		
	}
}