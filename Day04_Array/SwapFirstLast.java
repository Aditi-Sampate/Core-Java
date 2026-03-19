import java.util.Scanner;

class SwapFirstLast
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter how many numbers you want : ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("\nEnter Array Elements : ");

		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int temp = arr[0];
		arr[0] = arr[arr.length -1];
		arr[arr.length -1] = temp;

		System.out.println("\nArray After Swap : ");

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}

	}
}