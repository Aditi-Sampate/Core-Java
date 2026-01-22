//String Comparison Checker Program

import java.util.Scanner;

class StringCompare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter One String :");
		String s1 = sc.nextLine();

		System.out.println("Enter Another String :");
		String s2 = sc.nextLine();

		System.out.println(s1.equals(s2));
		/*Compare Two Strings using equals() method
		  This method is case-sensitive (Java != java)
		  It returns true if both strings are exactly same
		*/

		System.out.println(s1.equalsIgnoreCase(s2));
		/* Compare two Strings using equalsIgnoreCase() method
		   This method ignores uppercase and lowercase difference
		   It returns true even if case is different
		*/

	}
}