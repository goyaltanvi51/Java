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