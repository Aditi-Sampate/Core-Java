import java.util.Scanner;

//Interface for Validation rules
interface Validator
{
	boolean validate(String input);
}

//Email Validation Rule
class EmailValidator implements Validator
{
	public boolean validate(String input)
	{
		return input.contains("@")&& input.contains(".");
	}
}

//Password Validation Rule 
class PasswordValidator implements Validator
{
	public boolean validate(String input)
	{
		return input.length() >= 8;
	}
}

//Age Validation Rule 
class AgeValidator implements Validator
{
	public boolean validate(String input)
	{
		int age = Integer.parseInt(input);
		return age >= 18;
	}
}

//Main Validation System 
public class ValidationSystem
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Validator Validator = null;

		System.out.println("Choose Validation Type :");
		System.out.println("1.Email Validation");
		System.out.println("2.Password Validation");
		System.out.println("3.Age Validation");
		System.out.println("Enter Choice :");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Input to Validate :");
		String input = sc.nextLine();

		if(choice == 1)
		{
			Validator = new EmailValidator();
		}	
		else if(choice == 2)
		{
			Validator = new PasswordValidator();
		}
		else if(choice == 3)
		{
			Validator = new AgeValidator();
		}
		else
		{
			System.out.println("Invalid Choice !");
			System.exit(0);
		}

		if(Validator.validate(input))
		{
			System.out.println("Validation Successful");
		}
		else
		{
			System.out.println("Validation Failed");
		}
		sc.close();
	}
}

