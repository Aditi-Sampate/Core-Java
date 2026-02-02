import java.util.Scanner;

interface RoleAccess{
	boolean checkRole(String role);
}

interface PasswordCheck{
	boolean verifyPassword(String password);
}

interface Logger {
	void  log (String message);
}


class LoginSystem implements RoleAccess , PasswordCheck, Logger{

	public boolean checkRole(String role){

		return role.equalsIgnoreCase("admin")
				|| role.equalsIgnoreCase("student")
	            || role.equalsIgnoreCase("teacher")
	            || role.equalsIgnoreCase("Principle")
	            || role.equalsIgnoreCase("staff Member")
	            || role.equalsIgnoreCase("Employee")
	            || role.equalsIgnoreCase("Community Members");
	}

	public boolean verifyPassword(String password){

		return password.length() >= 6;
	}

	public void log(String message){
		System.out.println("Log: " +message);
	}
}




public class LoginApp
{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		LoginSystem system = new LoginSystem();

		System.out.println("**--- Welcome to School ---**");
        System.out.println(
            "1. Admin\n" +
            "2. Student\n" +
            "3. Teacher\n" +
            "4. Principal\n" +
            "5. Staff\n" +
            "6. Community\n" +
            "7. Employee"
        );

         System.out.print("Enter choice (1-7): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

         String role = "";

        switch (choice) {
            case 1: 
            	role = "admin"; 
                break;
            
            case 2:
            	 role = "student"; 
            	 break;

            case 3:
            	 role = "teacher";
            	 break;

            case 4:
            	 role = "principal";
            	 break;

            case 5: 
            	  role = "staff";
            	  break;

            case 6:
             	   role = "community";
             	   break;

            case 7: 
            		role = "employee"; 
            		break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        
        System.out.print("Enter password: ");
        String password = sc.nextLine();


		if(system.checkRole(role) && system.verifyPassword(password))
		{
			system.log("Login Successful");
			System.out.println("Access Granted");
		}

		else
		{
			system.log("Login Failed");
			System.out.println("Access Denied");
		}
	}
}