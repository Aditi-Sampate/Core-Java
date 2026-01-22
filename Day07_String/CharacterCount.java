import java.util.Scanner;

class CharacterCount
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A String");
		String str = sc.nextLine();

		int count=0;

		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
		}
		//Without space it count Character
		System.out.println("Total Character : "+count);
	}
}