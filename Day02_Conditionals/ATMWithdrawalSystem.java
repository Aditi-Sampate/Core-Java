import java.util.Scanner;

class ATMWithdrawalSystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double balance = 10000;

		System.out.println("Enter withdrawal Amount :");

		double amount = sc.nextDouble();

		if(amount > 0)
		{
			if(amount <= balance)
			{
				if(amount % 100 == 0)
				{
					balance -= amount;

					System.out.println("withdrawal Successful.");

					System.out.println("Remaining balance :"+balance);
				}

				else
				{
					System.out.println("Amount must be multiple of 100");
				}
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}	
		else
		{
			System.out.println("Invalid withdrawal Amount");
		}

		sc.close();
	}
}