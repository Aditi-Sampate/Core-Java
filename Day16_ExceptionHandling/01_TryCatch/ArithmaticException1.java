class ArithmaticException1
{
	public static void main(String[] args) {
		
		int[] numerators = {10, 200, 30, 40};
		int[] denominators = {1, 2, 0, 4};

		for(int i = 0; i < numerators.length; i++)
		{
			// Calling divide method
			// When i = 2 → 30 / 0
			// Division by zero causes ArithmeticException
			System.out.println(divide(numerators[i] , denominators[i])); //Exception in thread "main" java.lang.ArithmeticException: / by zero
		}

		// This line will NOT execute because program stops when exception occurs
		System.out.println("Continue.....");
	}
/*
	public static int divide(int a, int b)
	{	
		// If b = 0 → Java throws ArithmeticException: / by zero
		return a / b;

	}

*/
		//to resolve this exception we use try catch.

	public static int divide(int a, int b)
	{
		try
		{
			return a / b;
		}
		catch (ArithmeticException e)
		{
			//this block run when b=0.
			System.out.println("Cannot divide by zero.");

			return 0;
		}
	}
}