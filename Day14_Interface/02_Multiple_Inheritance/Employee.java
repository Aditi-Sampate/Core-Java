import java.util.Scanner;

interface Attendance{
	boolean mark();
}

interface Salary{
	double calculateSalary(int days);
}

interface Performance{
	String review();
}

class EmployeeSystem implements Attendance, Salary, Performance
{
	public boolean mark()
	{
		return true;
	}

	public double calculateSalary(int days)
	{
		return days * 1500;
	}

	public String review()
	{
		return "Excellent";
	}
}

class Employee
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		EmployeeSystem emp = new EmployeeSystem();

		System.out.println("Enter Working Days :");
		int days = sc.nextInt();

		if(emp.mark())
		{
			System.out.println("Salary :"+emp.calculateSalary(days));
			System.out.println("Performance :"+emp.review());
		}	
	}
}