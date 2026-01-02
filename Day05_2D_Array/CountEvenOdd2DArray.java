//Q. Write a program to count the even and odd numbers.

class CountEvenOdd2DArray{

	public static void main(String[] args) {
		int[][] arr = {

			{10,20,30},
			{43,54,98},
			{76,87,98}
		};

		int evenCount = 0;
		int oddCount = 0;

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
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
		System.out.println("Total Even Number :"+evenCount);
		System.out.println("Total Odd Numbers :"+oddCount);
	}
	
}