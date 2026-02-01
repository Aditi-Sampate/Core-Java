import java.util.Scanner;

//Interface for notification
interface NotificationService
{
	void sendNotification(String message);
}

//Email Notification
class EmailNotification implements NotificationService
{
	public void sendNotification(String message)
	{
		System.out.println("Email Sent :"+message);
	}
}

//SMS Notification
class SMSNotification implements NotificationService
{
	public void sendNotification(String message)
	{
		System.out.println("SMS Sent :"+message);
	}
}

//WhatsApp Notification
class WhatsAppNotification implements NotificationService
{
	public void sendNotification(String message)
	{
		System.out.println("WhatsApp Message Sent :"+message);
	}
}

//Main Class with user input 
public class NotificationSystem
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
	
		NotificationService service = null;

		System.out.println("Choose Notification Type :");
		System.out.println("1.Email");
		System.out.println("2.SMS");
		System.out.println("3.WhatsApp");
		System.out.println("Enter Choice :");

		int choice = sc.nextInt();
		sc.nextLine();	//Clear Buffer

		System.out.println("Enter Message :");
		String message = sc.nextLine();

		//Runtime Selection
		if(choice == 1)
		{
			service = new EmailNotification();
		}
		else if(choice == 2)
		{
			service = new SMSNotification();
		}
		else
		{
			System.out.println("Invalid Choice!");
			System.exit(0);
		}
		//Polymorphic call
		service.sendNotification(message);
		sc.close();

	}
}