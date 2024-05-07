package org.example;

import javax.swing.*;

public class NewWindowTest {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("test test test");

    public NewWindowTest() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
