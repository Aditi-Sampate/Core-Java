//Create Java program to input and print 2D array using Scanner.

import java.util.Scanner;

class Print2DArray
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of  Rows");
		int row = sc.nextInt();

		System.out.println("Enter Number of Columns");
		int column = sc.nextInt();

		int arr[][] = new int [row][column];

		System.out.println("Enter 2D Array Elements:");

		for(int i = 0; i < row; i++)
		{
			for(int j= 0; j < column; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("2D Array Elements are: ");

		for(int i = 0; i < row; i++)
		{
			for(int j =0; j <column; j++)
			{
				System.out.print(arr[i][j] + "\t ");
			}

			//System.out.println();
		}

	}
}