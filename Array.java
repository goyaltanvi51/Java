// Program for 1D array operations
import java.util.Scanner;
class Array1{
    int arr[] = new int[5];
    // input method
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    // output1
    void output1() {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // output2
    void output2() {
        System.out.println("\nReverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    // reverse array
    void reverse() {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("\nAfter reversing:");
        output1();
    }
}
public class Array {
    public static void main(String[] args) {
        Array1 obj = new Array1();
        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}