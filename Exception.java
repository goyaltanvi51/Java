// Program to demonstrate exceptions
public class Exception{
    public static void main(String[] args) {
        //ARRAY EXCEPTION
        try {
            int arr[] = new int[5];  // array of size 5
            arr[10] = 100;  // invalid index gives exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred");
        }
        //ARITHMETIC EXCEPTION
        try {
            int a = 10;
            int b = 0;
            int c = a / b;  // divide by zero gives exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}