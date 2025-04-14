package bubble_pkg;

import javax.swing.*;
import java.awt.*;

public class frame_class {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bubble Frame");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        // Removed fixed height here

        JLabel label = new JLabel("Enter numbers (comma separated):");
        JTextField textField = new JTextField(20);
        JButton sortButton = new JButton("Sort");

        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(sortButton);

        JTextArea resultArea = new JTextArea(20, 45);
        JScrollPane scrollPanel = new JScrollPane(resultArea);
        scrollPanel.setPreferredSize(new Dimension(500, 400));

        action_class click = new action_class();
        sortButton.addActionListener(e -> click.doBubbleSort(textField, resultArea));

        frame.add(inputPanel);
        frame.add(scrollPanel);
        frame.setVisible(true);
    }
}
