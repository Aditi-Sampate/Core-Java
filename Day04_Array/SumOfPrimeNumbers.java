import java.util.Scanner;

class SumOfPrimeNumbers
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many numbers you wants:");
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("\n Enter Array Elements:");

		for(int i =0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		for(int i = 0; i < arr.length; i++)
		{
			int num = arr[i];

			boolean isPrime = true;

			if(num < 2)
			{
				isPrime = false;
			}

			for(int j = 2; j <= num/2; j++)
			{
				if(num % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if(isPrime)
			{
				sum = sum + num;
			}
		}

		System.out.println("\n Sum of Prime Numbers: "+sum);
	}
}