class ArrayIndexEx
{
	public static void main(String[] args) {
		
		try
		{
			int arr[] = new int[3];
			arr[5] = 100;
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Invalid Array Index.");
		}

		System.out.println("Program Continues...");
	}
}