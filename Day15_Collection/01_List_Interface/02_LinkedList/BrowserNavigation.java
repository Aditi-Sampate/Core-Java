import java.util.LinkedList;

public class BrowserNavigation
{
	public static void main(String[] args) 
	{
		//LinkedList used as Stack (LIFO)
		LinkedList<String> history = new LinkedList<>();

		//Visiting Web Pages
		history.push("google.com");
		history.push("github.com");
		history.push("stackoverflow.com");

		System.out.println("Browser History :");
		System.out.println(history);	

		//Back operation (remove last visited page)
		if(!history.isEmpty())
		{
			String lastpage = history.pop();
			System.out.println("\n Back From :"+lastpage);
		}

		//Current page after back
		if(!history.isEmpty())
		{
			System.out.println("Current Page :"+history.peek());
		}
		else
		{
			System.out.println("No Page Available");
		}

		System.out.println("\nUpdated Browser History :");
		System.out.println(history);
	}
}