//Create One Program to Count Vowels, Consonants, Digits & Special form String.

import java.util.Scanner;

class StringAnalysis
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter String :");
		String str = sc.nextLine();

		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int special =0;

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);

			if(ch >= '0' && ch <= '9')
			{
				digits ++;
			}
			else if((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z'))
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}	
			}
			else
			{
				special++;
			}
		}

		System.out.println("Vowels :"+vowels);
		System.out.println("Consonants :"+consonants);
		System.out.println("Digits :"+digits);
		System.out.println("Special Characters :" +special);
	}
}