class Employee 
{
    int empId;
    String empName;
    double basicSalary;

    void setEmployee(int id, String name, double salary) {
        empId = id;
        empName = name;
        basicSalary = salary;
    }
}

class SalaryEmployee extends Employee 
{

    double hra;
    double da;
    double netSalary;

    void calculateSalary() 
    {
        hra = basicSalary * 0.20;   // 20% HRA
        da  = basicSalary * 0.10;   // 10% DA
        netSalary = basicSalary + hra + da;
    }

    void display() 
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        SalaryEmployee e = new SalaryEmployee();

        e.setEmployee(101, "Prachi", 30000);
        e.calculateSalary();
        e.display();
    }
}