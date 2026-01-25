//Created BankAccount class using encapsulation with private fields, setters, getters, and basic deposit logic

import java.util.Scanner;

class BankAccount
{
	private long accountNumber;
	private String holderName;
	private double balance;
	private double currentBill;

	public void setAccountNumbeer(long accNo)
	{
		this.accountNumber = accNo;
	}

	public long getAccountNumber()
	{
		return accountNumber;
	}

	public void setHolderName(String name)
	{
		this.holderName = name;
	}

	public String getHolderName()
	{
		return holderName;
	}

	public void setBalance(double account)
	{
		this.balance =balance;
	}

	public double getbalance()
	{
		return balance;
	}


	// Methods
	public void setCurrentBill(double bill)
	{
		if(bill >0)
		{
			currentBill = bill;
		}
		else
		{
			System.out.println("Invalid Bill Amount");
		}
	}


	public void deposit(double amount)
	{
		if(amount >0)
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("Invalid Deposit Amount");
		}
	}

	public void withdraw(double amount)
	{
		if(amount >0 && amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient balance or Invalid amount");
		}
	}

	public void display()
	{
		System.out.println("Amount Number :"+accountNumber);
		System.out.println("Holder Name:"+holderName);
		System.out.println("Balance:"+balance);
		System.out.println("Current Bill: "+ currentBill);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		BankAccount acc =new BankAccount();

		int choice;

		System.out.println("Enter Account Number:");
		acc.setAccountNumber(sc.nextLong());

		sc.nextLine();

		do{
			System.out.println("\n1.Deposit");
			System.out.println("2.withdraw");
			System.out.println("3.Add Current Bill");
			System.out.println("4.Display Account");
			System.out.println("5.Exit");
			System.out.println("Enter Choice:");
			choice = sc.nextInt();


			switch(choice)
			{
			case 1:
				System.out.println("Enter Deposit Amount:");
				acc.deposit(sc.nextDouble());
				break;

			case 2:
				System.out.println("Enter withdraw amount: ");
				acc.withdraw(sc.nextDouble());
				break;

			case 3:
				System.out.println("Enter Current Bill Amount:");
				acc.setCurrentBill(sc.nextDouble());
				break;

			case 4:
				acc.display();
				break;

			case 5:
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice");
			}
		} while(choice != 5);
	}

}