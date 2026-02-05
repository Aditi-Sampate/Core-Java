import java.util.LinkedList;

class TaskManager
{
	public static void main(String[] args) {
		
		LinkedList<String> tasks = new LinkedList<>();

		tasks.add("Wake Up");
		tasks.add("Attend Class");
		tasks.add("Study Java");
		tasks.add("Practice Coding");

		System.out.println("Daily Tasks: ");
		System.out.println(tasks);

		tasks.addFirst("Morning Exercise");
		System.out.println(" \n After adding urgent task:");
		System.out.println(tasks);

		tasks.addLast("Revision");
		System.out.println("\n After adding last task:");
		System.out.println(tasks);

		System.out.println("\nCompleted Task: "+ tasks.removeFirst());

		System.out.println("\n Completed Task: "+ tasks.removeLast());

		tasks.set(1 , "Study Core Java");

		System.out.println("\n Current Task: "+tasks.getFirst());

		System.out.println("\n Final Task List: ");
		System.out.println(tasks);
	}
}