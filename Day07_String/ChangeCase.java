//Add String Case Conversion Program

import java.util.Scanner;

class ChangeCase
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String str = sc.nextLine();

		System.out.println("UpperCase :"+str.toUpperCase());
		//Converts the String into uppercase letters

		System.out.println("LowerCase :"+str.toLowerCase());
		//Converts the String into LowerCase Letters

	}
}