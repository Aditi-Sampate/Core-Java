class Employee	//class
{
	int empId;
	String empName;
	double empsalary;

	void show() //Method
	{
		System.out.println("Employee ID :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Salary :"+empsalary);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(); //Object Creation

		e1.empId = 1;
		e1.empName = "Aditi";
		e1.empsalary = 123445;


		e1.show();	//Method call by using referance object
	}
}