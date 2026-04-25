## File: Message.java
<details><summary>Click to view code</summary>

```java
package mypack.subpack;

public class Message {
    public void show() {
        System.out.println("Hello");
    }
}
```
</details>

## File: Add.java
<details><summary>Click to view code</summary>

```java
package mypack;

public class Add {
    public void show() {
        System.out.println("Addition");
    }
}
```
</details>

## File: Div.java
<details><summary>Click to view code</summary>

```java
// Division class
package mypack;

public class Div {

    public void show() {
        int a = 10, b = 5;
        System.out.println("Division = " + (a / b));
    }
}
```
</details>

## File: Msg.java
<details><summary>Click to view code</summary>

```java
// Message class
package mypack;

public class Msg {

    public void show() {
        System.out.println("Hello from package!");
    }
}
```
</details>

## File: Mul.java
<details><summary>Click to view code</summary>

```java
// Multiplication class
package mypack;

public class Mul {

    public void show() {
        int a = 10, b = 5;
        System.out.println("Multiplication = " + (a * b));
    }
}
```
</details>

## File: Sub.java
<details><summary>Click to view code</summary>

```java
package mypack;

public class Sub {
    public void show() {
        System.out.println("Subtraction");
    }
}
```
</details>

## File: AgeCheck.java
<details><summary>Click to view code</summary>

```java
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
<img width="757" height="583" alt="Screenshot 2026-04-25 181456" src="https://github.com/user-attachments/assets/9b91ea22-efa5-46d0-ac82-8c5c54669b46" />

```
</details>

## File: Array.java
<details><summary>Click to view code</summary>

```java
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
<img width="766" height="221" alt="image" src="https://github.com/user-attachments/assets/eea24cb3-f897-4361-a4f0-72cecabb1699" />

```
</details>

## File: Cal1.java
<details><summary>Click to view code</summary>

```java
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
<img width="642" height="136" alt="image" src="https://github.com/user-attachments/assets/a69ded35-2fd8-4e22-853b-bd6ce7c598db" />

```
</details>

## File: CalculatorGUI.java
<details><summary>Click to view code</summary>

```java
// Simple Calculator using Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// main class
public class CalculatorGUI extends JFrame implements ActionListener {
    JTextField t1, t2, result;
    JButton add, sub, mul, div;
    CalculatorGUI() {
        // frame settings
        setTitle("Calculator");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // text fields
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        // buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        // adding components
        add(new JLabel("Enter First Number:"));
        add(t1);
        add(new JLabel("Enter Second Number:"));
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(new JLabel("Result:"));
        add(result);
        // event handling
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double res = 0;
            // check which button
            if (e.getSource() == add)
                res = a + b;
            else if (e.getSource() == sub)
                res = a - b;
            else if (e.getSource() == mul)
                res = a * b;
            else if (e.getSource() == div) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                    return;
                }
                res = a / b;
            }
            result.setText(String.valueOf(res));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers!");
        }
    }
    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
<img width="428" height="359" alt="image" src="https://github.com/user-attachments/assets/be7c4495-e38e-4167-a1aa-9c81b48fe997" />

```
</details>

## File: CProgram.java
<details><summary>Click to view code</summary>

```java
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
<img width="664" height="249" alt="image" src="https://github.com/user-attachments/assets/1f87782c-5650-4a00-b51f-42714782df2d" />

```
</details>

## File: Distance_add.java
<details><summary>Click to view code</summary>

```java
// Program to add two distances (m, cm, mm)
class Distance {
    int m, cm, mm;
    // constructor
    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }
    // method to add two distances
    Distance add(Distance d2) {
        int mm = this.mm + d2.mm;
        int cm = this.cm + d2.cm + mm / 10;  // convert mm to cm
        mm = mm % 10;
        int m = this.m + d2.m + cm / 100;    // convert cm to m
        cm = cm % 100;
        return new Distance(m, cm, mm);
    }
    // display method
    void display() {
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }
}
public class Distance_add {
    public static void main(String[] args) {
        // creating objects
        Distance d1 = new Distance(2, 75, 8);
        Distance d2 = new Distance(3, 40, 6);
        Distance result = d1.add(d2);
        System.out.print("Result = ");
        result.display();
    }
}
<img width="847" height="47" alt="image" src="https://github.com/user-attachments/assets/84b654d9-ecf7-4e17-9852-460687232e8d" />

```
</details>

## File: Distance_add2.java
<details><summary>Click to view code</summary>

```java
// Program to add two distances (m, cm only)

class Distance2 {
    int m, cm;
    // constructor
    Distance2(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }
    // method to add two distances
    Distance2 add(Distance2 d2) {
        int cm = this.cm + d2.cm;
        int m = this.m + d2.m + cm / 100;  // convert cm â†’ m
        cm = cm % 100;
        return new Distance2(m, cm);
    }
    // display method
    void display() {
        System.out.println(m + " m " + cm + " cm");
    }
}
public class Distance_add2 {
    public static void main(String[] args) {
        // creating objects
        Distance2 d1 = new Distance2(2, 80);
        Distance2 d2 = new Distance2(3, 50);
        Distance2 result = d1.add(d2);
        System.out.print("Result = ");
        result.display();
    }
}
<img width="797" height="40" alt="image" src="https://github.com/user-attachments/assets/f634cbf5-e3d4-4f18-8418-92c3cc1aa1a6" />

```
</details>

## File: e1.java
<details><summary>Click to view code</summary>

```java
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
<img width="793" height="77" alt="image" src="https://github.com/user-attachments/assets/bbca7f2b-0a6c-4659-9626-da4a8b9ea0e4" />

```
</details>

## File: Matrix1.java
<details><summary>Click to view code</summary>

```java
// Program for matrix operations
class Matrix {
    int a[][] = {{1,2},{3,4}};
    int b[][] = {{5,6},{7,8}};
    // addition
    void addition() {
        System.out.println("Addition:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
    // transpose
    void transpose() {
        System.out.println("Transpose:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
    // row sum
    void rowSum() {
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<2;j++){
                sum += a[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
        }
    }
    // column sum
    void colSum() {
        for(int i=0;i<2;i++){
            int sum=0;
            for(int j=0;j<2;j++){
                sum += a[j][i];
            }
            System.out.println("Column " + i + " sum = " + sum);
        }
    }
    // diagonal sum
    void diagonalSum() {
        int sum=0;
        for(int i=0;i<2;i++){
            sum += a[i][i];
        }
        System.out.println("Diagonal sum = " + sum);
    }
}
public class Matrix1 {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.addition();
        m.transpose();
        m.rowSum();
        m.colSum();
        m.diagonalSum();
    }
}
<img width="718" height="267" alt="image" src="https://github.com/user-attachments/assets/f644bfe4-3720-4b16-bc54-3023b33f1d82" />

```
</details>

## File: MatrixAddition.java
<details><summary>Click to view code</summary>

```java
// Matrix Addition with dynamic size (Swing)

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MatrixAddition extends JFrame implements ActionListener {

    JTextField rowsField, colsField;
    JButton createBtn, addBtn;

    JTextField[][] A, B, R;

    int rows, cols;

    JPanel top, center;

    MatrixAddition() {

        setTitle("Matrix Addition");
        setSize(600, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ===== TOP PANEL =====
        top = new JPanel();

        top.add(new JLabel("Rows:"));
        rowsField = new JTextField(5);
        top.add(rowsField);

        top.add(new JLabel("Columns:"));
        colsField = new JTextField(5);
        top.add(colsField);

        createBtn = new JButton("Create Matrix");
        addBtn = new JButton("Add");

        top.add(createBtn);
        top.add(addBtn);

        add(top, BorderLayout.NORTH);

        // ===== CENTER PANEL =====
        center = new JPanel();
        add(center, BorderLayout.CENTER);

        createBtn.addActionListener(this);
        addBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createBtn) {
            try {
                rows = Integer.parseInt(rowsField.getText());
                cols = Integer.parseInt(colsField.getText());
                center.removeAll();
                center.setLayout(new GridLayout(3 * rows + 3, cols));
                A = new JTextField[rows][cols];
                B = new JTextField[rows][cols];
                R = new JTextField[rows][cols];
                // Matrix A
                center.add(new JLabel("Matrix A"));
                for (int i = 1; i < cols; i++) center.add(new JLabel(""));
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        A[i][j] = new JTextField(3);
                        center.add(A[i][j]);
                    }
                }
                // Matrix B
                center.add(new JLabel("Matrix B"));
                for (int i = 1; i < cols; i++) center.add(new JLabel(""));
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        B[i][j] = new JTextField(3);
                        center.add(B[i][j]);
                    }
                }
                // Result Matrix
                center.add(new JLabel("Result"));
                for (int i = 1; i < cols; i++) center.add(new JLabel(""));

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        R[i][j] = new JTextField(3);
                        R[i][j].setEditable(false);
                        center.add(R[i][j]);
                    }
                }
                center.revalidate();
                center.repaint();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter valid rows and columns!");
            }
        }
        if (e.getSource() == addBtn) {
            try {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        int a = Integer.parseInt(A[i][j].getText());
                        int b = Integer.parseInt(B[i][j].getText());
                        R[i][j].setText(String.valueOf(a + b));
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter all values correctly!");
            }
        }
    }
    public static void main(String[] args) {
        new MatrixAddition();
    }
}
<img width="740" height="729" alt="image" src="https://github.com/user-attachments/assets/f8c18a7e-8a56-4c90-bcee-1f4cdc73da02" />

```
</details>

## File: Paint.java
<details><summary>Click to view code</summary>

```java
// Simple Paint Program using Mouse
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Paint extends JFrame implements MouseMotionListener, ActionListener {
    int size = 5;              // brush size
    Color c = Color.BLACK;     // default color
    JButton red, blue, big, small;
    Paint() {
        // frame settings
        setTitle("Simple Paint");
        setSize(500, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create buttons
        red = new JButton("Red");
        blue = new JButton("Blue");
        big = new JButton("Big");
        small = new JButton("Small");
        // add buttons
        add(red);
        add(blue);
        add(big);
        add(small);
        // add action listeners
        red.addActionListener(this);
        blue.addActionListener(this);
        big.addActionListener(this);
        small.addActionListener(this);
        // mouse listener
        addMouseMotionListener(this);
        setVisible(true);
    }
    // drawing when mouse is dragged
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(c);   // set color
        int x = e.getX();
        int y = e.getY();
        g.fillOval(x, y, size, size);  // draw dot
    }
    public void mouseMoved(MouseEvent e) {}
    // button actions
    public void actionPerformed(ActionEvent e) {
        // change color
        if (e.getSource() == red)
            c = Color.RED;
        else if (e.getSource() == blue)
            c = Color.BLUE;
        // change size
        else if (e.getSource() == big)
            size = 15;
        else if (e.getSource() == small)
            size = 5;
    }

    public static void main(String[] args) {
        new Paint(); // run program
    }
}
<img width="715" height="556" alt="image" src="https://github.com/user-attachments/assets/a72fda55-a5dc-4ac7-856e-c6d5feafcfa9" />

```
</details>

## File: Shapes.java
<details><summary>Click to view code</summary>

```java
// Draw shapes using buttons
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Shapes extends JFrame implements ActionListener {
    JButton circleBtn, rectBtn, ovalBtn;
    String shape = "";  // to store selected shape
    Shapes() {
        setTitle("Shapes Program");
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create buttons
        circleBtn = new JButton("Circle");
        rectBtn = new JButton("Rectangle");
        ovalBtn = new JButton("Oval");
        // add buttons to frame
        add(circleBtn);
        add(rectBtn);
        add(ovalBtn);
        // add action listeners
        circleBtn.addActionListener(this);
        rectBtn.addActionListener(this);
        ovalBtn.addActionListener(this);
        setVisible(true);
    }
    // button click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circleBtn)
            shape = "circle";
        else if (e.getSource() == rectBtn)
            shape = "rect";
        else if (e.getSource() == ovalBtn)
            shape = "oval";
        repaint(); // redraw
    }
    public void paint(Graphics g) {
        super.paint(g);
        if (shape.equals("circle")) {
            g.drawOval(200, 150, 100, 100);
        }
        else if (shape.equals("rect")) {
            g.drawRect(200, 150, 120, 80);
        }
        else if (shape.equals("oval")) {
            g.drawOval(200, 150, 150, 80);
        }
    }
    public static void main(String[] args) {
        new Shapes();
    }
}
<img width="733" height="662" alt="image" src="https://github.com/user-attachments/assets/07785a50-7f5f-4bf5-8422-30551111cd61" />

```
</details>

## File: Swing1.java
<details><summary>Click to view code</summary>

```java
// Program to add two numbers using Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AddSwing extends JFrame implements ActionListener {
    JLabel l1, l2, l3;      // labels
    JTextField t1, t2, t3;  // text fields
    JButton b;              // button
    AddSwing() {
        // frame features
        setTitle("Addition Program");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create components
        l1 = new JLabel("Enter First Number:");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter Second Number:");
        t2 = new JTextField(10);
        l3 = new JLabel("Result:");
        t3 = new JTextField(10);
        t3.setEditable(false);
        b = new JButton("Add");
        // add components
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        add(t3);
        // event handling
        b.addActionListener(this);
        setVisible(true);
    }
    // ActionListener
    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a + b;
            t3.setText(String.valueOf(sum));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers!");
        }
    }
    public static void main(String[] args) {
        new AddSwing(); // object creation
    }
}
<img width="413" height="258" alt="image" src="https://github.com/user-attachments/assets/c6a63748-f941-46f8-927c-ec47de63389b" />

```
</details>

## File: TestPackage.java
<details><summary>Click to view code</summary>

```java

import mypack.*;   // import all classes
public class TestPackage {
    public static void main(String[] args) {
        // creating objects
        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();
        Msg msg = new Msg();
        // calling methods
        a.show();
        s.show();
        m.show();
        d.show();
        msg.show();
    }
}
<img width="690" height="136" alt="image" src="https://github.com/user-attachments/assets/3f03f405-e764-4f87-a29b-32ba854cc43c" />

```
</details>

## File: TestSubPackage.java
<details><summary>Click to view code</summary>

```java
// main class to test package and subpackage
import mypack.*;               // import main package
import mypack.subpack.*;       // import subpackage
public class TestSubPackage {
    public static void main(String[] args) {
        Add a = new Add();         // from main package
        Message m = new Message(); // from subpackage
        a.show();
        m.show();
    }
}
<img width="860" height="68" alt="image" src="https://github.com/user-attachments/assets/31fe1b5b-ac36-4db9-af95-b18ab22c4713" />

```
</details>

## File: Threading.java
<details><summary>Click to view code</summary>

```java
// Program to print 1â€“100 three times
// using without thread, Thread class, Runnable interfaces
// CLASS WITHOUT THREAD
class WithoutThread {
    void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class Threading {
    public static void main(String[] args) {
        System.out.println("WITHOUT THREAD");
        WithoutThread obj = new WithoutThread();
        obj.printNumbers();
        obj.printNumbers();
        obj.printNumbers();
        System.out.println("\nUSING THREAD");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("\nUSING RUNNABLE");
        Thread r1 = new Thread(new MyRunnable());
        Thread r2 = new Thread(new MyRunnable());
        Thread r3 = new Thread(new MyRunnable());
        r1.start();
        r2.start();
        r3.start();
    }
}
<img width="1224" height="464" alt="image" src="https://github.com/user-attachments/assets/d6347cea-b103-497f-8b64-745caf823740" />

```
</details>

## File: Time_add1.java
<details><summary>Click to view code</summary>

```java
// Program to add time (hours, minutes, seconds)
class Time {
    int hr, min, sec;
    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    Time add(Time t) {
        int sec = this.sec + t.sec;
        int min = this.min + t.min + sec / 60;
        sec = sec % 60;
        int hr = this.hr + t.hr + min / 60;
        min = min % 60;
        return new Time(hr, min, sec);
    }
    void display() {
        System.out.println("Time = " + hr +"hours"+ ":" + min + "minutes" +":" + sec+"seconds");
    }
}
public class Time_add1 {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);
        Time t3 = t1.add(t2);
        t3.display();
    }
}
<img width="705" height="55" alt="image" src="https://github.com/user-attachments/assets/fa4c3aee-7042-49ce-a368-0b59f45b814f" />

```
</details>

## File: Time_add2.java
<details><summary>Click to view code</summary>

```java
// Program to add time (hours and minutes)

class Time2 {
    int hr, min;
    Time2(int hr, int min) {
        this.hr = hr;
        this.min = min;
    }
    Time2 add(Time2 t) {
        int min = this.min + t.min;
        int hr = this.hr + t.hr + min / 60;
        min = min % 60;
        return new Time2(hr, min);
    }
    void display() {
        System.out.println(hr + " hr " + min + " min");
    }
}
public class Time_add2{
    public static void main(String[] args) {
        Time2 t1 = new Time2(2, 40);
        Time2 t2 = new Time2(1, 30);
        Time2 t3 = t1.add(t2);
        t3.display();
    }
}
<img width="776" height="59" alt="image" src="https://github.com/user-attachments/assets/b4eeaa13-c31e-4d0a-8edb-dd0d4809227c" />

```
</details>

## File: UsingSynchro.java
<details><summary>Click to view code</summary>

```java
// Program to print 1â€“100 using threads in sequence
// using synchronization
class Syncro extends Thread {
    String name;  // to identify thread
    Syncro(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("Starting " + name);
        // print numbers
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnding " + name);
    }
}
public class UsingSynchro {
    public static void main(String[] args) {
        // creating 3 threads
        Syncro t1 = new Syncro("Thread 1");
        Syncro t2 = new Syncro("Thread 2");
        Syncro t3 = new Syncro("Thread 3");
        try {
            // start first thread
            t1.start();
            t1.join();   // wait for t1 to finish
            // start second thread
            t2.start();
            t2.join();   // wait for t2
            // start third thread
            t3.start();
            t3.join();   // wait for t3
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
<img width="1216" height="324" alt="image" src="https://github.com/user-attachments/assets/336c792e-b655-47ab-9ed3-e6948e00ab0e" />

```
</details>






           







        


        

            



