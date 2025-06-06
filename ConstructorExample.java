class Calculator {
    int result;
    
    Calculator() {
        this.result = 0;
        System.out.println("Initialized to: " + result);
    }
    
    Calculator(int a, int b) {
        this.result = a + b;
        System.out.println("Addition result: " + result);
    }
    
    Calculator(int a, int b, String op) {
        switch(op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            default: result = 0;
        }
        System.out.println("Operation result: " + result);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(5, 3);
        Calculator c3 = new Calculator(10, 2, "/");
    }
}