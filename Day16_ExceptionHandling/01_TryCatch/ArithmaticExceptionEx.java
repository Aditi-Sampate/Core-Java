
class ArithmaticExceptionEx
{
	public static void main(String[] args) {
		
		/*int ino1 = 20;
		int ino2 = 0;

		int ans = ino1 / ino2;
		System.out.println("Result" +ans);  	//ArithmaticException
		*/ 

		try
		{
			int a = 20;
			int b = 0;

			int result = a /b ;

			System.out.println("Result : " + result);
		}

		catch (ArithmeticException e)
		{
			System.out.println("Error: Cannot divide by zero.");
			System.out.println("Exception Message: " + e.getMessage());
		}

	}
}