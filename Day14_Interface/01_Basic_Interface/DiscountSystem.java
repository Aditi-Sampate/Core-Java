import java.util.Scanner;

//Interface for discount logic 
interface DiscountStrategy
{
	double applyDiscount(double amount);
}

//Regular Customer Discount 
class RegularCustomer implements DiscountStrategy
{
	public double applyDiscount(double amount)
	{
		return amount - (amount *0.05);//5% discount
	}
}

//Premium Customer discount
class PremiumCustomer implements DiscountStrategy
{
	public double applyDiscount(double amount)
	{
		return amount - (amount * 0.20); //20% discount 
	}
}

//Festival Offer Discount 
class FestivalOffer implements DiscountStrategy
{
	public double applyDiscount(double amount)
	{
		return amount - 500; //flat 500 off
	}
}

//Main System 
public class DiscountSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DiscountStrategy strategy = null;

		System.out.println("Enter Bill Amount :");
		double amount = sc.nextDouble();

		System.out.println("\nSelect Customer Type :");
		System.out.println("1. Regular Customer");
		System.out.println("2.Premium Customer");
		System.out.println("3.Festival Offer :");

		int choice = sc.nextInt();

		if(choice == 1)
		{
			strategy = new RegularCustomer();
		}
		else if(choice == 2)
		{
			strategy = new PremiumCustomer();
		}
		else if(choice == 3)
		{
			strategy = new FestivalOffer();
		}
		else
		{
			System.out.println("Invalid Choice");
			System.exit(0);
		}

		double finalAmount = strategy.applyDiscount(amount);

		System.out.println("Final Amount After Discount : rs."+finalAmount);
		sc.close();
	}
}