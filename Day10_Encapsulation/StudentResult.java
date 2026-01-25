import java.util.Scanner;

class StudentResult
{
	private int rollNo;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	
	public void setName(String name)
	{
		this.name=name;
	}

	public void setMarks1(int m1)
	{
		if( m1 >= 0 && m1 <= 100)
		{
			marks1 = m1;
		}
		else
		{
			System.out.println("Invalid Marks for Subject 1");
		}
	}

	public void  setMarks2(int m2)
	{
		if( m2 >= 0 && m2 <= 100)
		{
			marks2 = m2;
		}
		else
		{
			System.out.println("Invalid Marks for Subject 2");
		}
	}

	public void setMarks3(int m3)
	{
		if(m3 >= 0 && m3 <= 100)
		{
			marks3 = m3;
		}
		else
		{
			System.out.println("Invalid Marks for Subject 3");
		}
	}

	public int getTotal()
	{
		return marks1 + marks2 + marks3;
	}

	public double getPersentage()
	{
		return getTotal() / 3.0;
	}

	public void display()
	{
		System.out.println("\n-----Student Result -----");
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Total Marks:"+getTotal());
		System.out.println("Percentage: "+getPersentage());
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		StudentResult = sr = new StudentResult();

		System.out.println("Enter Roll Number :");
		sr.setRollNo(sc.nextInt());

		sc.nextLine();	//Buffer Clear

		System.out.println("Enter Name :");
		sr.setName(sc.nextLine());

		System.out.println("Enter Marks of Subject 1 :");
		sr.setMarks1(sc.nextInt());

		System.out.println("Enter Marks of Subject 2 :");
		sr.setMarks2(sc.nextInt());

		System.out.println("Enter Marks of Subject 3 :");
		sr.setMarks3(sc.nextInt());

		sr.display();
	}

}