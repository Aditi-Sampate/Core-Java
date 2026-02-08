import java.util.Vector;
import java.util.Collections;

public class ExamResults {

    public static void main(String[] args) {

        Vector<Integer> marks = new Vector<>();

        // Add marks
        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);

        System.out.println("Marks:");
        System.out.println(marks);

        // Update mark
        marks.set(3, 70); // change 4th mark from 67 to 70

        // Highest mark
        int highestMark = Collections.max(marks); // get actual highest
        System.out.println("Highest Mark: " + highestMark);
    }
}