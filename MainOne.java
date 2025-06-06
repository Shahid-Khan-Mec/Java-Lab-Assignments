class Shape {
    public void display() {
        System.out.println("Displaying Shape");
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void display() {
        super.display(); 
        double area = Math.PI * radius * radius;
        System.out.println("Displaying Circle with radius " + radius + " and area " + area);
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
    public void display() {
        super.display(); 
        double area = length * width;
        System.out.println("Displaying Rectangle with length " + length + 
                         ", width " + width + " and area " + area);
    }
}
public class MainOne {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Calling Shape display():");
        shape.display();
        
        System.out.println("\nCalling Circle display():");
        Shape circle = new Circle(5.0);
        circle.display();
        
        System.out.println("\nCalling Rectangle display():");
        Shape rectangle = new Rectangle(4.0, 6.0);
        rectangle.display();
    }
}