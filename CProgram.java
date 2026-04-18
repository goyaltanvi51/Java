// Java program to perform multiple operations using class and object
// Programs- Factorial, Armstrong, Palindrome, Fibonacci, Pattern
import java.util.Scanner;
// creating class
class Programs {
    Scanner sc = new Scanner(System.in);
    // Factorial Method
    void factorial() {
        int n;
        long fact = 1;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        // loop to calculate factorial
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
    // Armstrong Method
    void armstrong() {
        int n, temp, r, sum = 0;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        temp = n;
        // calculate sum of cubes
        while(n > 0) {
            r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }
        if(sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
    // Plindrome Method
    void palindrome() {
        int n, temp, r, rev = 0;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        temp = n;
        // reverse number
        while(n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if(rev == temp)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome number");
    }

    // Fibonacci Method
    void fibonacci() {
        int n;
        int a = 0, b = 1, c;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        System.out.print("Fibonacci series: " + a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Pattern Method
    void pattern() {
        System.out.println("Pattern:");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class CProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programs obj = new Programs(); 
        int choice;
        System.out.println("\n--- MENU ---");
        System.out.println("1. Factorial");
        System.out.println("2. Armstrong");
        System.out.println("3. Palindrome");
        System.out.println("4. Fibonacci");
        System.out.println("5. Pattern");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        // switchcase
        switch(choice) {
            case 1:
                obj.factorial();
                break;
            case 2:
                obj.armstrong();
                break;
            case 3:
                obj.palindrome();
                break;
            case 4:
                obj.fibonacci();
                break;
            case 5:
                obj.pattern();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}