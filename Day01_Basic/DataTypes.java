class DataTypes
{
	public static void main(String[] args) 
	{
		
		short s1 = 34;	//Stores small whole numbers using 2 bytes.
		byte byte1 = 25;	//Stores very small whole numbers using 1 byte.
		int ino = 565440;	//Stores integer values for general calculations using 4 bytes.
		long mobileNo = 1233456545;	//Stores large whole numbers like mobile numbers using 8 bytes.

		char char1 = 'A';	//Stores a single character using 2 bytes.
		String name = "Aditi";	//Stores a sequence of characters (text).
		boolean b1 = true;	//Stores true or false values.

		float value = 334;	//Stores decimal numbers with single precision using 4 bytes.
		double value1 = 34564.44445;	//Stores decimal numbers with double precision using 8 bytes.

	

		System.out.println("Short value : "+s1);
		System.out.println("Byte Value : "+byte1);
		System.out.println("int Value : "+ino);
		System.out.println("Long Value : "+mobileNo);

		System.out.println("Char Value : "+char1);
		System.out.println("String Value : "+name);
		System.out.println("Boolean Value : "+b1);

		System.out.println("Float Value : "+value);
		System.out.println("Double Value : "+value1);


	}
}