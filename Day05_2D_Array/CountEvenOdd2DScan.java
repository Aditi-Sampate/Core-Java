//Create Java program to take input from user and  Count Total Number of Even and Odd Elements

import java .util.Scanner;

class CountEvenOdd2DScan
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		
		System.out.print("Enter Number of Rows :");
		int rows = sc.nextInt();

		System.out.println();
		System.out.print("Enter Number of Columns :");
		int columns = sc.nextInt();

		System.out.println();
		System.out.println("Enter Elements : ");

		int arr[][] = new int[rows][columns];

		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Elements Are : ");
		System.out.println();


		int evenCount = 0;
		int oddCount = 0;

		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				if(arr[i][j] % 2 == 0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
			}
		}


		System.out.println("Total Even Count = "+evenCount);
		System.out.println("Total Odd Count = "+oddCount);
	}
}