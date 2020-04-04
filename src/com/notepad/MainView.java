package com.notepad;

import javax.swing.*;

public class MainView {
    private JPanel mainPanel;
    private JButton newMenuButton;
    private JToolBar menuBar;
    private JEditorPane editorPane;
    private JButton openMenuButton;
    private JButton saveMenuButton;
    private JButton saveAsMenuButton;
    private JButton addWordToDictionaryMenuButton;
    private JButton aboutMenuButton;
    private JCheckBox hintsCheckBox;

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
