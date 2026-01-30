import java.util.Scanner;

/* Parent Class */
abstract class Payment
{
	double amount;

	Payment(double amount)
	{
		this.amount = amount;
	}
	abstract void pay();	//method to override
}

// Child Class
class CreditCardPayment extends Payment
{
	CreditCardPayment(double amount){
		super(amount);
	}

	@Override
	void pay()
	{
		System.out.println("Payment Mode : Credit Card");
		System.out.println("Processing Credit Card Payment...");
		System.out.println("Amount Paid :"+amount);
	}
}

//Child class
class UPIPayment extends Payment
{
	UPIPayment(double amount)
	{
		super(amount);
	}

	@Override
	void pay()
	{
		System.out.println("Payment Mode : UPI");
		System.out.println("Processing UPI Payment...");
		System.out.println("Amount Paid :"+amount);
	}
}

//Child Class
class CashPayment extends Payment
{
	CashPayment(double amount)
	{
		super(amount);
	}

	@Override
	void pay(){
		System.out.println("Payment Mode : Cash");
		System.out.println("Collect Cash From Customer");
		System.out.println("Amount Paid :"+amount);
	}
}

class PaymentApp{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount :");
		double amount = sc.nextDouble();

		System.out.println("\n Choose Payment Method :");
		System.out.println("1. Credit Card");
		System.out.println("2. UPI");
		System.out.println("3. Cash");

		int choice = sc.nextInt();
		Payment payment = null;

		switch(choice)
		{
			case 1:
				payment = new CreditCardPayment(amount);
				break;

			case 2:
				payment = new UPIPayment(amount); 
				break;

			case 3:
				payment = new CashPayment(amount);
				break;

			default:
				System.out.println("Invalid Choice");
				System.exit(0);
		}

		System.out.println("\n---- Payment Details ----");
		payment.pay();	//method override polymorphism 
	}
}