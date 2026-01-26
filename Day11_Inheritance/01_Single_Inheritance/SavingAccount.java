class BankAccount
{
	long accountNumber;
	double balance;

	void setAccount(long accNo, double bal)
	{
		accountNumber = accNo;
		balance = bal;
	}

	void deposit(double amount)
	{
		balance += amount;
	}

}

class SavingAccount extends BankAccount
{
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

	void display()
	{
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Balance :"+balance);
	}

	public static void main(String[] args) 
	{
		SavingAccount s = new SavingAccount();

		s.setAccount(44556765434l,4000);
		s.deposit(1500);
		s.withdraw(2000);
		s.display();
	}
}