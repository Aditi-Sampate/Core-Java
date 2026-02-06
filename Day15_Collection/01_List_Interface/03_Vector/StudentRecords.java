import java.util.Vector;

public class StudentRecords {

    public static void main(String[] args) {

        Vector<String> students = new Vector<>();

        // Add students
        students.add("Prachi");
        students.add("Aditi");
        students.add("Komal");

        System.out.println("Students List:");
        System.out.println(students);

        // Insert at index
        students.add(1, "Sakshi");

        // Update record
        students.set(2, "Komal Patil");

        // Remove student
        students.remove("Aditi");

        System.out.println("\nUpdated Students List:");
        System.out.println(students);
    }
}