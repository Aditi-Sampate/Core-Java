import java.util.Scanner;

class Employee
{
	int empId;
	String empName;
	double basicSalary;

	void setEmployee(int id, String name, double salary)
	{
		empId = id;
		empName = name;
		basicSalary = salary;
	}
}

class EmployeeSalary extends Employee
{
	double hra;
	double da;
	double netSalary;

	void calculateSalary()
	{
		hra = basicSalary * 0.20;	//20% HRA
		da = basicSalary * 0.10;	//10% DA
		netSalary = basicSalary + hra + da;
	}

	void display()
	{
		System.out.println("\n---- Salary Details ----");
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Basic Salary :"+basicSalary);
		System.out.println("HRA :"+hra);
		System.out.println("DA :"+da);
		System.out.println("Net Salary :"+netSalary);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		SalaryEmployee e = new SalaryEmployee();

		System.out.println("Enter Employee ID :");
		int id = sc.nextInt();

		sc.nextLine();	//consume newline

		System.out.println("Enter Employee Name :");
		String name = sc.nextLine();

		System.out.println("Enter Basic Salary :");
		double salary = sc.nextDouble();

		e.setEmployee(id,name,salary);
		e.calculateSalary();
		e.display();

	}
}
