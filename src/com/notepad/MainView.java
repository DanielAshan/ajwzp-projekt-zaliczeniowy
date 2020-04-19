package com.notepad;

import javax.swing.*;
import java.awt.event.ActionListener;

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
    private NotepadFile file;

    public MainView() {
        this.file = new NotepadFile();
        ActionListener openFileActionListener = new OpenFileButtonListener(this.editorPane, this.file);
        ActionListener saveFileActionListener = new SaveFileButtonListener(this.editorPane, this.file);
        openMenuButton.addActionListener(openFileActionListener);
        saveMenuButton.addActionListener(saveFileActionListener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notepad");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
