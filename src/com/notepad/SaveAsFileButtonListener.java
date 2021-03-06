package com.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SaveAsFileButtonListener implements ActionListener {
    private JEditorPane editor;
    private NotepadFile file;

    public SaveAsFileButtonListener(JEditorPane editorPane, NotepadFile file) {
        this.editor = editorPane;
        this.file = file;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            this.file.saveAsFile(this.editor.getText());
            try {
                this.editor.setPage(this.file.getFileURL());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
