package com.notepad;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class NotepadFile {

    private File file;
    private boolean opened = false;

    public NotepadFile() {

    }

    public void openFile() {
        this.file = null;
        final JFrame fcFrame = new JFrame("Select file");
        final JFileChooser fc = new JFileChooser();
        int result = fc.showDialog(fcFrame, "Select file");
        if (result == JFileChooser.APPROVE_OPTION) {
            this.file = fc.getSelectedFile();
            this.setOpened(true);
        }
    }

    public void saveFile(String text) throws IOException {
        if (this.getOpened()) {
            FileWriter fw = new FileWriter(this.file);
            fw.write(text);
            fw.close();
        }
    }
    public void clearFileInfo() {
        this.file = null;
        this.setOpened(false);
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
