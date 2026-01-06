import java.util.Scanner;

class BankingSystem
{
	static double balance = 5000;	//initial Balance

	static void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("Amount Deposited Successfully");
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}

	static void withdraw(double amount)
	{
		if(amount > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else if(amount <= 0)
		{
			System.out.println("Invalid Amount");
		}
		else 
		{
			balance = balance - amount;	
		
			System.out.println("Withdrawal Successfully");
		}
	}

	static void checkBalance()
	{
		System.out.println("Current Balance :"+balance);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int choice;

		do
		{
			System.out.println("\n-----Banking Menu------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");

			System.out.println("Enter Choice :");
			choice = sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter Deposit Amount :");
				double depositAmount = sc.nextDouble();

				deposit(depositAmount);
				break;

			case 2:
				System.out.println("Enter Withdraw Amount :");
				double withdrawAmount = sc.nextDouble();

				withdraw(withdrawAmount);
				break;

			case 3:
				checkBalance();
				break;

			case 4:
				System.out.println("Thank you for using Banking System");
				break;

			default:
				System.out.println("Invalid Choice");
			}

		}	

		while(choice != 4);

		sc.close();
	}

}