class EmployeeEncap
{
	private int empId;
	private String empName;
	private double empSalary;


	public void setEmpId(int id)
	{
		empId = id;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpName(String name)
	{
		empName = name;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpSalary(double salary)
	{
		empSalary = salary;
	}

	public double getEmpSalary()
	{
		return empSalary;
	}


	public static void main(String[] args) 
	{
		EmployeeEncap e = new EmployeeEncap();

		e.setEmpId(100);
		e.setEmpName("Aditi");
		e.setEmpSalary(20000);

		System.out.println("Id: "+e.getEmpId());
		System.out.println("Name: "+e.getEmpName());
		System.out.println("Salary: "+e.getEmpSalary());	
	
	}
}