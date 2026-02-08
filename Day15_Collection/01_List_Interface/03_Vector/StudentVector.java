import java.util.Vector;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentVector {

    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        // Add girls student records
        students.add(new Student("Prachi", 85));
        students.add(new Student("Neha", 90));
         students.add(new Student("Sakshi", 88));
        students.add(new Student("Sneha", 78));
       

        System.out.println("Girls Student Records:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Update marks of a student
        students.get(2).marks = 80; // Sneha's marks updated

        System.out.println("\nUpdated Records:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}