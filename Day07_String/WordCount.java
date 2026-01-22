import java.util.Scanner;

class WordCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Sentence :");
		String str = sc.nextLine();

		int count = 1; 	//Start Counting from 1 because at least one word is present

		for(int i=0; i<str.length(); i++)
		{
			//Every space means a new word
			if(str.charAt(i)== ' ')
			{
				count++;
			}
		}	
		System.out.println("total Word :"+count);
	}
}