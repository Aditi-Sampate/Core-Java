import java.util.Scanner;

class SwapNumbers
{
	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter First number: ");
	int a = sc.nextInt();

	System.out.println("Enter Second number: ");
	int b = sc.nextInt();

	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("After Swapping :");
	System.out.println("First Number: " +a);
	System.out.println("Second Number: " + b);
	
	}

}