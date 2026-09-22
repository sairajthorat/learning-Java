import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TermworkCalculator extends JFrame implements ActionListener {

    private JTextField[] assignmentFields;
    private JTextField[] testFields;
    private JButton calculateButton;
    private JButton resetButton;
    private JLabel resultLabel;

    public TermworkCalculator() {
        setTitle("Term work Marks Calculator");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(240, 248, 255));  // Set background color

        JPanel inputPanel = new JPanel(new GridLayout(11, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        inputPanel.setBackground(new Color(255, 250, 250));  // Set panel background color

        assignmentFields = new JTextField[6];
        testFields = new JTextField[5];

        Font labelFont = new Font("Arial", Font.BOLD, 18);
        Font fieldFont = new Font("Arial", Font.PLAIN, 18);

        for (int i = 0; i < 6; i++) {
            JLabel label = new JLabel("  Assignment " + (i + 1));
            label.setFont(labelFont);
            label.setForeground(new Color(0, 128, 0));  // Set label text color
            assignmentFields[i] = new JTextField();
            assignmentFields[i].setFont(fieldFont);
            assignmentFields[i].setBackground(new Color(255, 255, 224));  // Set text field background color
            assignmentFields[i].addKeyListener(new ArrowKeyListener(i, assignmentFields));
            inputPanel.add(label);
            inputPanel.add(assignmentFields[i]);
        }

        String[] testSubjects = {"  Data Structure and Algorithm ", "  Microprocessor", "  Engg. Mathematics 3", "  Principal of Programing Langualge", "  Software Engineering"};
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel(testSubjects[i]);
            label.setFont(labelFont);
            label.setForeground(new Color(0, 128, 128));  // Set label text color
            testFields[i] = new JTextField();
            testFields[i].setFont(fieldFont);
            testFields[i].setBackground(new Color(255, 255, 224));  // Set text field background color
            testFields[i].addKeyListener(new ArrowKeyListener(i, testFields));
            inputPanel.add(label);
            inputPanel.add(testFields[i]);
        }

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(new Color(240, 248, 255));  // Set panel background color
        calculateButton = new JButton("Calculate Term work Marks");
        calculateButton.addActionListener(this);
        calculateButton.setFont(new Font("Arial", Font.BOLD, 18));
        calculateButton.setBackground(new Color(0, 191, 255));  // Set button background color
        calculateButton.setForeground(Color.WHITE);  // Set button text color
        buttonPanel.add(calculateButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        resetButton.setFont(new Font("Arial", Font.BOLD, 18));
        resetButton.setBackground(new Color(220, 20, 60));  // Set button background color
        resetButton.setForeground(Color.WHITE);  // Set button text color
        buttonPanel.add(resetButton);

        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 24));
        resultLabel.setForeground(new Color(220, 20, 60));  // Set result label text color

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculateTermworkMarks();
        } else if (e.getSource() == resetButton) {
            resetFields();
        }
    }

    private void calculateTermworkMarks() {
        double assignmentTotal = 0;
        double testTotal = 0;

        // Calculate average assignment marks
        for (int i = 0; i < 6; i++) {
            try {
                double mark = Double.parseDouble(assignmentFields[i].getText());
                if (mark < 0 || mark > 15) {
                    JOptionPane.showMessageDialog(this, "Assignment marks should be between 0 and 15");
                    return;
                }
                assignmentTotal += mark;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for assignment marks");
                return;
            }
        }
        double assignmentAverage = assignmentTotal / 6;

        // Convert test marks out of 100 to out of 10
        for (int i = 0; i < 5; i++) {
            try {
                double mark = Double.parseDouble(testFields[i].getText());
                if (mark < 0 || mark > 100) {
                    JOptionPane.showMessageDialog(this, "Test marks should be between 0 and 100");
                    return;
                }
                testTotal += (mark * 0.1);  // Convert to out of 30
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for test marks");
                return;
            }
        }
        double testAverage = testTotal / 5;

        // Calculate teamwork marks
        double termworkMarks = assignmentAverage + testAverage;

        DecimalFormat df = new DecimalFormat("#.##");
        resultLabel.setText("<html><div style='font-size:28px;'>Termwork Marks: " + df.format(termworkMarks) + "</div></html>");
    }

    private void resetFields() {
        for (int i = 0; i < 6; i++) {
            assignmentFields[i].setText("");
        }
        for (int i = 0; i < 5; i++) {
            testFields[i].setText("");
        }
        resultLabel.setText("");
    }

    private class ArrowKeyListener extends KeyAdapter {
        private int index;
        private JTextField[] fields;

        public ArrowKeyListener(int index, JTextField[] fields) {
            this.index = index;
            this.fields = fields;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_DOWN && index < fields.length - 1) {
                fields[index + 1].requestFocus();
            } else if (e.getKeyCode() == KeyEvent.VK_UP && index > 0) {
                fields[index - 1].requestFocus();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TermworkCalculator());
    }
}
