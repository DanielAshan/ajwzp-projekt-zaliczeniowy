package com.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SaveFileButtonListener implements ActionListener {
    private JEditorPane editor;
    private NotepadFile file;

    public SaveFileButtonListener(JEditorPane editorPane, NotepadFile file) {
        this.editor = editorPane;
        this.file = file;
    }

    public void actionPerformed(ActionEvent e) {
        try {
           this.file.saveFile(this.editor.getText());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
