import java.util.Scanner;

interface Evaluation{
	int calculateMarks(int marks, int attempts);
}

interface Result{
	String getResult(int finalMarks);
}

interface Certificate{
	void generateCertificate(String grade);
}

class ExamResult implements Evaluation,Result,Certificate
{
	@Override
	public int calculateMarks(int marks, int attempts)
	{
		if(marks <0 || marks>100)
		{
			return -1; 
		}
		//Grace only for first Attempt & near pass
		else if(marks >=35 && marks <40 && attempts ==1)
		{
			return 40;
		}
		if(attempts >2)
		{
			return marks -5;
		}
		return marks;
	}

	@Override
	public String getResult(int finalMarks)
	{
		if(finalMarks >= 75)
		{
			return "Distinction";
		}
		else if(finalMarks >= 60)
		{
			return "First Class";
		}
		else if(finalMarks >= 40)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}

	@Override
	public void generateCertificate(String grade)
	{
		System.out.println("Certificate Generated for Grade :"+grade);
	}
}

class ExamSystem
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ExamResult exam = new ExamResult();

		System.out.println("Enter Marks in between 1 to 100 \n");

		System.out.println("Enter Marks :");
		int marks = sc.nextInt();

		System.out.println("Enter Attempts Number :");
		int attempts = sc.nextInt();

		int finalMarks = exam.calculateMarks(marks,attempts);

		if(finalMarks == -1)
		{
			System.out.println("Error : Invalid Marks Entered");
			return;
		}	

		System.out.println("Final Marks :"+finalMarks);

		String result = exam.getResult(finalMarks);
		System.out.println("Result :"+result);

		if(!result.equals("Fail"))
		{
			exam.generateCertificate(result);
		}
	}

}