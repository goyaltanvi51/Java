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