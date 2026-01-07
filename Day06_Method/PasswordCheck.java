 import java.util.Scanner;

 class PasswordCheck
 {
	public static void main(String[] args) {
 		
 		Scanner sc = new Scanner(System.in);

 		System.out.println("Enter Password :");
 		String pass = sc.nextLine();

 		int cap=0, small=0, num=0, special=0;

 		for(int i=0; i<pass.length(); i++)
 		{
 			char ch= pass.charAt(i);

 			if(ch >= 'A' && ch <= 'Z')
 			{
 				cap++;
 			}
 			else if(ch >= 'a' && ch <= 'z')
 			{
 				small++;
 			}
 			else if(ch >= '0' && ch <= '9')
 			{
 				num++;
 			}
 			else
 			{
 				special++;
 			}
 		}

 		if(cap >0 && small>0 && num>0 && special>0)
 		{
 			System.out.println("Strong Password");
 		}
 		else
 		{
 			System.out.println("Weak Password");
 		}
 	}
 }