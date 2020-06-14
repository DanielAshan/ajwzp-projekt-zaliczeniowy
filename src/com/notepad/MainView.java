package com.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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
        ActionListener newFileActionListener = new NewFileButtonListener(this.editorPane, this.file);
        ActionListener saveAsFileActionListener = new SaveAsFileButtonListener(this.editorPane, this.file);
        ActionListener aboutActionListener = new AboutButtonListener();
        openMenuButton.addActionListener(openFileActionListener);
        saveMenuButton.addActionListener(saveFileActionListener);
        newMenuButton.addActionListener(newFileActionListener);
        saveAsMenuButton.addActionListener(saveAsFileActionListener);
        aboutMenuButton.addActionListener(aboutActionListener);

    }

    public static void main(String[] args) {
        PropertiesHandler propertiesHandler = new PropertiesHandler();

        JFrame frame = new JFrame("Notepad");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(propertiesHandler.getWindowWidth(), propertiesHandler.getWindowHeight());
        frame.setLocation(propertiesHandler.getWindowPositionX(), propertiesHandler.getWindowPositionY());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                propertiesHandler.setWindowHeight(frame.getHeight());
                propertiesHandler.setWindowWidth(frame.getWidth());
                propertiesHandler.setWindowPositionX(frame.getLocation().x);
                propertiesHandler.setWindowPositionY(frame.getLocation().y);
                propertiesHandler.saveProperties();
                System.out.println("Test");
                super.windowClosing(e);
            }
        });


    }

}
