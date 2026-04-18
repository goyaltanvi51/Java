// Simple user-defined exception program
import java.util.Scanner;
// custom exception
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
            System.out.println("Valid age");
        } 
        catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void checkAge(int age) throws MyException {

        if (age < 18) {
            throw new MyException("Age must be 18 or above");
        }
    }
}