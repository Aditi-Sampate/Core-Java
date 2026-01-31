import java.util.Scanner;

abstract class Shapes
{
	abstract void area();
}

class Circle extends Shapes
{
	double radius;

	Circle (double r)
	{
		this.radius = r;
	}

	@Override
	void area()
	{
		System.out.println("Circle Area: " + (3.14 * radius * radius));
	}
}

class Rectangle extends Shapes {
	double length;
	double width;

	Rectangle( double l , double w)
	{
		length = l;
		width = w;
	}

	@Override
	void area(){
		System.out.println("Rectagle Area: "+ (length * width));
	}


}

class Shape
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Shape: \n 1.Circle \n 2.Reactangle");
		int choice = sc.nextInt();

		Shapes s;

		if(choice == 1)
		{
			System.out.println("Enter radius:");
			double r =sc.nextDouble();

			s= new Circle(r);

		}

		else 
		{
			System.out.println("Enter Length and width:");
			double l = sc.nextDouble();
			double w = sc.nextDouble();	

			s = new Rectangle( l , w);

		}

			s.area();

	}
}