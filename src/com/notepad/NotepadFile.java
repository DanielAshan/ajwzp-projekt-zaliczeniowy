package com.notepad;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class NotepadFile {

    private File file;
    private boolean opened = false;

    public NotepadFile() {

    }

    public void openFile() {
        final JFrame fcFrame = new JFrame("Select file");
        final JFileChooser fc = new JFileChooser();
        int result = fc.showDialog(fcFrame, "Select file");
        if (result == JFileChooser.APPROVE_OPTION) {
            this.file = fc.getSelectedFile();
            this.setOpened(true);
        }
    }

    public URL getFileURL() throws MalformedURLException {
        return this.file.toURI().toURL();
    }

    public void setOpened(boolean status)
    {
        this.opened = status;
    }

    public boolean getOpened()
    {
        return this.opened;
    }
}