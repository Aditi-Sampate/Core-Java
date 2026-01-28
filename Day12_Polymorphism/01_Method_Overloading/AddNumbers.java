class AddNumbers
{
	int add(int a, int b)
	{
		return a+b;
	}

	int add(int a, int b, int c)
	{
		return a + b + c; 
	}

	double add(double a, double b)
	{
		return a + b;
	}

	public static void main(String[] args) {
		
		AddNumbers obj = new AddNumbers();

		System.out.println("Sum of 2 ints :"+obj.add(10,20));
		System.out.println("Sum of 3 ints :"+obj.add(5,10,15));
		System.out.println("Sum of 2 doubles :"+obj.add(2.5, 3.5));
		
	}
}
