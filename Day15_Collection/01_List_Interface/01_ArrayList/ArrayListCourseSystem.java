import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListCourseSystem {
    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Courses (One Time)");
            System.out.println("2. View Courses");
            System.out.println("3. Search Course");
            System.out.println("4. Remove Course");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            // 1️⃣ ADD
            if (choice == 1) {

                System.out.print("How many courses you want to add: ");
                int n = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter course name: \n ");

                for (int i = 0; i < n; i++) {
                    courses.add(sc.nextLine().trim());
                }

                System.out.println("Courses added successfully \n");
                System.out.println("Course List:" + courses);
            }

            // 2️⃣ VIEW
            else if (choice == 2) {

                if (courses.size() == 0) {
                    System.out.println("No courses available");
                } else {
                    System.out.println("Course List:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println(courses.get(i));
                    }
                }
            }

            // 3️⃣ SEARCH
            else if (choice == 3) {

                System.out.print("Enter course to search: ");
                String search = sc.nextLine().trim();

                boolean found = false;

                for (int i = 0; i < courses.size(); i++) {
                    if (courses.get(i).equalsIgnoreCase(search)) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Course Found \n");
                    System.out.println("Course List:" + courses);
                } else {
                    System.out.println("Course Not Found");
                }
            }

            // 4️⃣ REMOVE
            else if (choice == 4) {

                System.out.print("Enter course to remove: ");
                String remove = sc.nextLine().trim();

                boolean removed = false;

                for (int i = 0; i < courses.size(); i++) {
                    if (courses.get(i).equalsIgnoreCase(remove)) {
                        courses.remove(i);
                        removed = true;
                        break;
                    }
                }

                if (removed) {
                    System.out.println("Course Removed Successfully.\n");
                    System.out.println("Courses List:" + courses);
                } else {
                    System.out.println("Course Not Found");
                }
            }

        } while (choice != 0);

        System.out.println("Program Ended");
    
    }
}