// Program to perform addition, subtraction, multiplication, division
// using class, objects
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    int mul(int a, int b) {
        return a * b;
    }
    int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division not possible");
            return 0;
        }
        return a / b;
    }
}
public class Cal1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();  // object creation
        System.out.println("Add int = " + c.add(10, 5));
        System.out.println("Add double = " + c.add(2.5, 3.5));
        System.out.println("Sub = " + c.sub(10, 5));
        System.out.println("Mul = " + c.mul(10, 5));
        System.out.println("Div = " + c.div(10, 5));
    }
}