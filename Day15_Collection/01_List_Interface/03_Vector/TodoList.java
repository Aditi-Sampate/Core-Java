import java.util.Vector;

public class TodoList {

    public static void main(String[] args) {
        Vector<String> tasks = new Vector<>();

        // Add tasks
        tasks.add("Finish homework");
        tasks.add("Buy groceries");
        tasks.add("Clean room");
        tasks.add("Read book");

        System.out.println("To-Do List:");
        System.out.println(tasks);

        // Mark first task as done
        if (!tasks.isEmpty()) {
            String doneTask = tasks.remove(0);
            System.out.println("\nCompleted: " + doneTask);
        }

        // Insert urgent task at the top
        tasks.add(0, "Pay bills");
        System.out.println("\nUpdated To-Do List:");
        System.out.println(tasks);
    }
}