import java.util.Scanner;

class SmartCalculator
{
	static int calculate(int a,int b, char op)
	{
		switch(op)
		{
			case '+':return a+b;
			case '-':return a-b;
			case '*':return a*b;
			case '/':return b!= 0 ? a/b : 0;

			default: return 0;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char choice;

		do
		{
			System.out.println("Enter First Number :");
			int a = sc.nextInt();

			System.out.println("Enter Second Number :");
			int b = sc.nextInt();

			System.out.println("Enter Operator (+ - * /):");
			char op = sc.next().charAt(0);

			int result = calculate(a, b,op);
			System.out.println("Result :"+result);

			System.out.println("continue ? (y/n):");
			choice = sc.next().charAt(0);

		}
		while(choice == 'y' || choice == 'Y');
	}
}