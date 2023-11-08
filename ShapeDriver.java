// Base class
abstract class Shape {
    abstract void draw();
    abstract void erase();
}

// Subclass Circle
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass Square
class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
    void erase() {
        System.out.println("Erasing Square");
    }
}

public class ShapeDriver {
    public static void main(String[] args) {
        // create instances of each shape
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        // call draw() method on each shape
        circle.draw();
        triangle.draw();
        square.draw();

        // call erase() method on each shape
        circle.erase();
        triangle.erase();
        square.erase();
    }
}
