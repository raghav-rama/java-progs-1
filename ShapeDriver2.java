public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }
}

public class ShapeDriver2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(3);
        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
    }
}

