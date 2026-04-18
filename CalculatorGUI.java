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