class Parent {
    void calculate(int a, int b) {
        System.out.println("Parent calculation: " + (a + b));
    }
}

class Child extends Parent {
    @Override
    void calculate(int a, int b) {
        System.out.println("Child multiplication: " + (a * b));
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.calculate(5, 3);
        
        Child c = new Child();
        c.calculate(5, 3);
    }
}