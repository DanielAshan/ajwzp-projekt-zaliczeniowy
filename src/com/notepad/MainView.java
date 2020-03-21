package com.notepad;

import sun.applet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    private JTextPane textPane1;
    private JButton button1;
    private JPanel mainPanel;
    private JToolBar toolbar;

    public MainView() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button clicked");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notatnik");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
