class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int marks1, marks2, marks3;

    void setMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    int getTotal() {
        return marks1 + marks2 + marks3;
    }

    double getPercentage() {
        return getTotal() / 3.0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Percentage: " + getPercentage());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setPersonDetails("Aditi", 21);
        s.setMarks(75, 80, 90);
        s.display();
    }
}