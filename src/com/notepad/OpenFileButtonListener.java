package com.notepad;

import com.sun.org.apache.xml.internal.resolver.helpers.FileURL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class OpenFileButtonListener implements ActionListener {
    private JEditorPane editor;
    private NotepadFile file;

    public OpenFileButtonListener(JEditorPane editorPane, NotepadFile file) {
        this.editor = editorPane;
        this.file = file;
    }

    public void actionPerformed(ActionEvent e) {
        this.file.openFile();
        try {
            this.editor.setPage(this.file.getFileURL());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
