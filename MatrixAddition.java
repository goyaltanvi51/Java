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

        // ===== CREATE MATRIX =====
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

        // ===== ADD MATRICES =====
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