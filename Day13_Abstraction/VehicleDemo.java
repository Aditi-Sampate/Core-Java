import java.util.Scanner;

abstract class Vehicle
{
	abstract void start();	//abstract Method --> without body
	abstract void stop();
}

class Car extends Vehicle
{
	@Override
	void start(){
		System.out.println("Car Started with key ignition.");
	}

	@Override
	void stop(){
		System.out.println("Car Stopped Using Brake.");
	}
}

class Bike extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("Bike Stopped Using Brake");
	}

	@Override
	void stop()
	{
		System.out.println("Bike Stopped Using Brake.");
	}
}

class VehicleDemo
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Vehicle : \n 1.Car \n 2.Bike");
		int choice = sc.nextInt();

		Vehicle v;

		if(choice == 1)
		{
			v = new Car();
		} 
		else
		{
			v = new Bike();
		}

		v.start();
		v.stop();
	}
}