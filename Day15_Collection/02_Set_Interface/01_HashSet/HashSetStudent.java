import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class HashSetStudent {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(101, "Siya"));
        
        students.add(new Student(102, "Riya"));
        
        students.add(new Student(103, "Kiya"));
        
        students.add(new Student(101, "Siya")); // duplicate rollNo

        System.out.println("Student List:");
       
        for (Student s : students) 
        {
            System.out.println(s);
        }
    }
}