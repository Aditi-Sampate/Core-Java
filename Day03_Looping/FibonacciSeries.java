
import java.util.Scanner;

class FibonacciSeries
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of terms:");
		int n = sc.nextInt();

		// Initialize first two Fibonacci numbers
		int first = 0;
		int second = 1;

		System.out.println("Fibonacci Series:");

		for(int i = 1; i <= n; i++)
		{
			// Print current Fibonacci number
			System.out.println(first + " ");

			// Calculate next number
			int next = first + second;
			
			// Shift values for next iteration
			first = second;
			second = next;
		}
	}
}
