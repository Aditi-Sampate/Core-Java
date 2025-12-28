import java.util.Scanner;

class MenuDrivenProgram 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int choice,num;

		do
		{
			System.out.println("\n 1. Reverse Number");
			System.out.println("2.Sum Of Digits");
			System.out.println("3.Exit");

			System.out.println("Enter Choice :");

			choice = sc.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter Number :");

				num = sc.nextInt();

				int rev = 0;

				while(num > 0)
				{
					rev = rev * 10 + num % 10;
					num = num / 10;
				}
				System.out.println("Reverse :"+rev);
			}
			else if(choice == 2)
			{
				System.out.println("Enter Number :");
				num = sc.nextInt();

				int sum = 0;

				do
				{
					sum = sum + num % 10;
					num = num / 10;
				}
				while(num > 0);
			
				System.out.println("Sum :"+sum);
				
			}
		}
		while(choice != 3);
		sc.close();
	}
}