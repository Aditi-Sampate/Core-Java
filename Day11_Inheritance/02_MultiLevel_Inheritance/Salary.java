//Created Multilevel Inheritance Program to show company, employee and salary details.

import java.util.Scanner;

class company
{
	String companyName;

	void setCompany(String name)
	{
		companyName = name;
	}
}

class Employee extends company
{
	int empId;

	void setEmployee(int id)
	{
		empId = id;
	}
}

class Salary extends Employee
{
	double salary;

	void setSalary(double sal)
	{
		salary = sal;
	}

	void display()
	{
		System.out.println("Company :"+companyName);
		System.out.println("Employee ID :"+empId);
		System.out.println("Salary :"+salary);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Salary s = new Salary();

		System.out.println("Enter Name :");
		String EName = sc.nextLine();

		System.out.println("Enter Employee ID :");
		int EmpId = sc.nextInt();

		System.out.println("Enter Salary :");
		double Salary = sc.nextDouble();

		s.setCompany("TCS");
		s.setEmployee(100);
		s.setSalary(10000);
		s.display();
	}
}