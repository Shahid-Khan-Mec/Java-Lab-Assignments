class Calculator {
    void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
    
    void calculate(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }
    
    void calculate(float a, float b) {
        System.out.println("Multiplication: " + (a * b));
    }
    
    void calculate(long a, long b) {
        System.out.println("Division: " + (a / b));
    }
}

public class OverloadExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate(5, 3);
        calc.calculate(5.0, 3.0);
        calc.calculate(5f, 3f);
        calc.calculate(10L, 2L);
    }
}