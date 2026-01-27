import java.util.Scanner;

class VehicleBrand{
	protected String brand;

	void setBrand(String brand)
	{
		this.brand = brand;
	}
}

class Car extends VehicleBrand{
	protected int speed;

	void setSpeed(int speed){
		if(speed >0)
		{
			this.speed = speed;
		}
		else
		{
			System.out.println("Invalid Speed");
		}
	}
}



class Vehicle extends Car
{
	double acceleration;//0-100 km/h time

	void setAcceleration(double acc)
	{
		if(acc > 0)
		{
			acceleration = acc;
		}
		else
		{
			System.out.println("Invalid Acceleration  Value");
		}
	}

	void showPerformance()
	{
		if(speed >= 200)
		{
			System.out.println("Performance :High Performance Sport Car");
		}
		else
		{
			System.out.println("Performance Normal Sport Car");
		}
	}

	void display()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Top Speed :"+speed+"km/h");
		System.out.println("0-100 km/h in:"+acceleration+"seconds");
		showPerformance();
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Vehicle v = new Vehicle();

		System.out.println("Enter Car Brand :");
		v.setBrand(sc.nextLine());

		System.out.println("Enter Top Speed :");
		v.setSpeed(sc.nextInt());

		System.out.println("Enter 0-100 Acceleration Time:");
		v.setAcceleration(sc.nextDouble());

		System.out.println("\n---- Sport Car Details ----");
		v.display();	
	}
}