class Shape {
    //Method to draw a generic shape
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    //Overriding draw() method to provide Circle-Specific Behavior
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape { 
    //Overriding draw() method to provide Rectangle- specific behavior.
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args) {
        //Parent class reference
        Shape s;

        //Runtime polymorphism : Circle object
        s = new Circle();
        s.draw();   // Calls Circle's draw()

        //Runtime polymorphism : Rectangle object
        s = new Rectangle();
        s.draw();   // Calls Rectangle's draw()
    }
}