import java.util.Scanner;

class SwapWithThreeVariable
{
	public static void main(String[] args) {
		

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter First number: ");
		int ino1 = sc.nextInt();

		System.out.println("Enter Second number: ");
		int ino2 = sc.nextInt();

		int temp = ino1;
		ino1 = ino2;
		ino2 = temp;

		System.out.println("After Swapping: ");
		System.out.println("First Number: " + ino1);
		System.out.println("Second Number:" + ino2);

	}
}