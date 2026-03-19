import java.util.Scanner;

class  MissingNumber
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter size of array (n-1)");

		int n = sc.nextInt();

		int arr[] = new int [n];

		System.out.println("Enter array Element from 1 to n with one missing:");

		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int expectedSum = (n + 1) * (n + 2) / 2;
		int actualSum = 0;

		for(int i = 0; i < n; i++)
		{
			actualSum = actualSum + arr[i];
		}

		int missing = expectedSum - actualSum;

		System.out.println("Missing Number is : " + missing);
	}
}
	