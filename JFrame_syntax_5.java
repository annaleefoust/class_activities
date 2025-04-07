package week12_02;

import java.awt.*;
import java.awt.event.*;  // You forgot to import ActionEvent and ActionListener
import javax.swing.*;

public class JFrame_syntax_5 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setLayout(new FlowLayout());

        JButton b1 = new JButton("Insert 1-9 to run the times table and Click");
        JTextField t = new JTextField(10);
        JTextArea ta1 = new JTextArea(10, 25);

        f.add(t);
        f.add(b1);
        f.add(ta1);

        // Action Listener
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta1.setText("");
                try {
                    int num = Integer.parseInt(t.getText());  // Fixed typo: Interger -> Integer
                    if(num>0 & num<10) {
                    for (int i = 1; i < 10; i++) {
                        ta1.append(num + " * " + i + " = " + (num * i) + "\n");  // Fixed: ta.1append -> ta1.append
                    }}
                } catch (Exception r) {
                    System.out.println("Insert Error");
                }
            }
        });

        f.setVisible(true);  // Fixed typo: setVisisble -> setVisible
    }
}
