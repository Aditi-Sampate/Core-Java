import java.util.Scanner;

class Account
{
	long accountNo;
	double balance;

	void setAccount(long acc, double bal)
	{
		accountNo = acc;
		balance = bal;
	}

}

class SavingAccount extends Account
{
	void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("Invalid Deposit Amount");
		}
	}
	void display()
	{
		System.out.println("Account No :"+accountNo);
		System.out.println("Balance :"+balance);
	}
}

class Transaction extends SavingAccount
{
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}


class BankAccount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		Transaction t = new Transaction();

		System.out.println("Enter Account Number :");
		long accNo = sc.nextLong();

		System.out.println("Enter Initial  Balance :");
		double bal = sc.nextDouble();

		t.setAccount(accNo,bal);

		System.out.println("Enter Deposit Account :");
		t.deposit(sc.nextDouble());

		System.out.println("Enter Withdraw Amount :");
		t.withdraw(sc.nextDouble());

		t.display();
	}
}