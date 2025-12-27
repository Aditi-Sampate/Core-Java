import java.util.Scanner;

class PrimeNumbersInRange
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start number:");
		int start = sc.nextInt();

		System.out.println("Enter End number:");
		int end = sc.nextInt();

		for(int num = start; num <= end; num++)
		{
			if(num < 2)
				continue;

			int count = 0;

			for(int i = 1; i <= num; i++)
			{
				if(num % i == 0)
				{
					count++;
				}
			}

			if(count == 2)
			{
				System.out.println(num + "");
			}
		}

		sc.close();
	}
}
