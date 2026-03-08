import java.util.Scanner;

class StringReverse
{

	static String reverse(String str)
	{
		 String revStr = " ";

		 for(int i = str.length() - 1; i >= 0; i--)
		 {
		 	revStr = revStr + str.charAt(i);
		 }

		 return revStr;
	}


	public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Any String : ");
	String str = sc.nextLine();

	System.out.println("Reverse : " +reverse(str));	

	}

}