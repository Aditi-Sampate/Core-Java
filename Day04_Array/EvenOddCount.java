//Q.write a java program to count even and odd numbers in an array.

class EvenOddCount
{
	public static void main(String[] args) 
	{
		int []arr = {12,7,5,10,8};
		int even=0, odd = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] %2 ==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}

		System.out.println("Even Count ="+even);
		System.out.println("Odd Count ="+odd);
		
	}
}