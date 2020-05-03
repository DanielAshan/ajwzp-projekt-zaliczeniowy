package com.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewFileButtonListener implements ActionListener {
    private JEditorPane editor;
    private NotepadFile file;

    public NewFileButtonListener(JEditorPane editorPane, NotepadFile file) {
        this.editor = editorPane;
        this.file = file;
    }

    public void actionPerformed(ActionEvent e) {
        this.file.clearFileInfo();
        this.editor.setText("");
    }
}