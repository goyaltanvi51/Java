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
