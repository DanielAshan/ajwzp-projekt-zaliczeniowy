package com.notepad;

import javax.swing.*;

public class MainView {
    private JPanel mainPanel;
    private JButton newMenuButton;
    private JToolBar menuBar;
    private JEditorPane editorPane;

    public MainView() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notatnik");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
