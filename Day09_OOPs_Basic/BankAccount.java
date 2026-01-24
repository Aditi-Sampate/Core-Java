import java.util.Scanner;

class BankAccount
{
	long accountNo;
	String holderName;
	double balance;

	//Method to display account details
	void display()
	{
		System.out.println("Account Number :" +accountNo);
		System.out.println("Account Holder Name :"+holderName);
		System.out.println("Balance :"+balance);
	}

	//Method to deposit amount
	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Amount Deposited :"+amount);
	}

	//Bank Account
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Amount withdraw :" +amount);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		BankAccount acc = new BankAccount();

		System.out.println("Enter Account Holder Name :");
		acc.holderName = sc.nextLine();

		System.out.println("Enter Account Number :");
		acc.accountNo = sc.nextLong();

		System.out.println("Enter Initial Balance :");
		acc.balance = sc.nextDouble();

		System.out.println("Enter Amount to Deposit :");
		double dep = sc.nextDouble();
		acc.deposit(dep);

		System.out.println("Enter Amount to withdraw :");
		double wit = sc.nextDouble();
		acc.withdraw(wit);

		System.out.println("\n Final Account Details :");
		acc.display();
	}
}