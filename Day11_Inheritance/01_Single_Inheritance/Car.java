import java.util.Scanner;

class Vehicle
{
	String brand;
	int speed;

	void setVehicle(String brand, int speed)
	{
		this.brand = brand;
		this.speed = speed;
	}
}

class Car extends Vehicle
{
	int gears;

	void setCarDetails(int gears)
	{
		this.gears = gears;
	}
	void display()
	{
		System.out.println("\n---- Car Details ----");
		System.out.println("Brand :"+brand);
		System.out.println("Speed :"+speed +"km/h");
		System.out.println("Gears :"+gears);
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		Car c = new Car();
		System.out.println("Enter Car Brand :");
		String brand = sc.nextLine();

		System.out.println("Enter Speed :");
		int speed = sc.nextInt();

		System.out.println("Enter Number of Gears :");
		int gears = sc.nextInt();

		c.setVehicle(brand,speed);	//Parent Method
		c.setCarDetails(gears);	//Child Method
		c.display();
	}
}