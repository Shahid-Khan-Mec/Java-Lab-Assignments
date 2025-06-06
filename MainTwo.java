class Shape {
    public double area() {
        System.out.println("Shape area calculation (default: 0)");
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
        return area;
    }
}

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
        System.out.println("Rectangle area: " + area);
        return area;
    }
}

public class MainTwo {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        shape1.area();  
        Shape shape2 = new Rectangle(4.0, 6.0);
        shape2.area();  
        Shape shape3 = new Shape();
        shape3.area();  
    }
}