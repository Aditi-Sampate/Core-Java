import java.util.Scanner;

//Interface Defining authentication rules
interface Authservice
{
	boolean authenticate(String username, String password);

	default void showAuthMessage()
	{
		System.out.println("Authentication Process started...");
	}

	static void authInfo()
	{
		System.out.println("Authservice v1.0 - Secure Login System");
	}
}

//Username & Password Based Authentication
class PasswordAuth implements Authservice
{
	public boolean authenticate(String username, String password)
	{
		return username.equals("admin") && password.equals("admin123");
	}
}

//OTP Based Authentication
class OTPAuth implements Authservice
{
	public boolean authenticate(String username, String password)
	{
		return password.equals("123456");
	}
}

//Main Class with user Choice
public class AuthSystem
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Authservice auth = null;

		Authservice.authInfo();

		System.out.println("\n Choose Authentication Method :");
		System.out.println("1. UserName & Password");
		System.out.println("2.OTP Authentication");


		System.out.println("Enter Choice :");
		int choice = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter UserName :");
		String username = sc.nextLine();

		System.out.println("Enter Password / OTP :");
		String password = sc.nextLine();

		if(choice == 1)
		{
			auth = new PasswordAuth();
		}
		else if(choice == 2)
		{
			auth = new OTPAuth();
		}
		else 
		{
			System.out.println("Invalid Choice !");
		}

		auth.showAuthMessage();

		if(auth.authenticate(username,password))
		{
			System.out.println("Authentication Successful !");
		}
		else 
		{
			System.out.println("Authentication Failed !");	
		}
	}

}

