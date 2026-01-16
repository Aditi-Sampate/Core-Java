import java.util.Scanner;

class PalindromeString
{
	static boolean isPalindrome(String str)
	{
		String rev = "";

		for(int i=str.length()-1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
		return str.equalsIgnoreCase(rev);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String s = sc.nextLine();

		if(isPalindrome(s))
		{
			System.out.print("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}