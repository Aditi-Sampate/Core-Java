//Q.Write a java program to find the sum of array elements using a method.

class ArraySum
{
	static int getSum(int []arr)
	{
		int sum = 0;

		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int []arr = {10,20,30,40};
		System.out.println("Sum ="+ getSum(arr));
	}
}