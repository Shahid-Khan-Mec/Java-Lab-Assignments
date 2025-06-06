// Base class
class Shape {
    public double area() {
        System.out.println("Shape area() called - default implementation");
        return 0;
    }
}

// Derived Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area() called: " + area);
        return area;
    }
}

// Derived Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        double area = length * width;
        System.out.println("Rectangle area() called: " + area);
        return area;
    }
}

public class MainThree {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        shape1.area();  

        Shape shape2 = new Rectangle(4.0, 6.0);
        shape2.area();  

        Shape shape3 = new Shape();
        shape3.area();  
    }
}