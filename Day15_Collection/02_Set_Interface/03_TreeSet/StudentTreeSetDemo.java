import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo; // sort by roll number
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class StudentTreeSetDemo {
    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();

        students.add(new Student(103, "Siya"));
        students.add(new Student(101, "Riya"));
        students.add(new Student(102, "Kiya"));

        System.out.println(students);
    }
}