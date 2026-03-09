class ArrayExample
{
	public static void main(String[] args) {
		
		/*
		int arr[] = {10, 20, 30, 40};
		System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
		*/

		//to resolve this ArrayIndexOutOfBoundsException  we use try and catch
		
		try 
		{
			int arr[] = {10, 20, 30, 40};

			System.out.println(arr[5]);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("Index not valid.");
		}

		System.out.println("Program Continue...");

	}
}