import java.util.Scanner;

abstract class BankAccount {

	double balance;

	abstract void deposit(double amount);
	abstract void withdraw(double amount);

	void showBalance(){

		System.out.println("Current Balance: "+balance);
	}
}

class SavingsAccount extends BankAccount{

	@Override
	void deposit(double amount){

		balance = balance + amount;
		System.out.println(amount + " deposited Successfully.");
	}

	@Override
	void withdraw(double amount){
		if(amount <= balance){
		
			balance = balance - amount;
			System.out.println("withdrawn successfully");
		
		}
		else
		{
			System.out.println("Insufficient Balance.");
		}

	}
}

class Bank{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		SavingsAccount acc = new SavingsAccount();

		System.out.println("Enter deposit amount:");
		acc.deposit(sc.nextDouble());

		System.out.println("Enter withdraw amount: ");
		acc.withdraw(sc.nextDouble());

		acc.showBalance();
	}
}