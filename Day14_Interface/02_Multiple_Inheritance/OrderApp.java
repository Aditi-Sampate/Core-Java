import java.util.Scanner;

interface Order{
	void createOrder(String item);

}

interface Payment{
	boolean makePayment(double amount);
}

interface Delivery{
	void deliver();
}

class OrderSystem implements Order, Payment, Delivery{

	public void createOrder(String item)
	{
		System.out.println("Order created for "+item);
	}

	public boolean makePayment(double amount){
		return amount >= 200;
	}

	public void deliver(){
		System.out.println("Order Delivered");
	}
}


public class OrderApp
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);

		OrderSystem order = new OrderSystem();

		System.out.println("Enter item name: ");
		String item = sc.nextLine();

		System.out.println("Enter amount: ");
		double amount = sc.nextDouble();

		order.createOrder(item);

		if(order.makePayment(amount))
		{
			order.deliver();
		}
		else
		{
			System.out.println("Payment Failed.");
		}
	}
}