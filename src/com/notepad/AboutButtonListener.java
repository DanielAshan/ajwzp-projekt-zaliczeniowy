package com.notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AboutButtonListener implements ActionListener {

    JFrame f;

    public AboutButtonListener() {
    }

    public void actionPerformed(ActionEvent e) {
        this.f = new JFrame();
        JOptionPane.showMessageDialog(f, this.prepareDialogMessage());
    }

    private String prepareDialogMessage() {
        int numberOfUserDictionaryWords = 0;
        int numberOfGlobalDictionaryWords = 0;

        String message = "Program stworzył Daniel Pieczyński \nNumer indeksu: 2227793 \n \n \n Ilość wyrazów w słowniku użytkownika: "
                + numberOfUserDictionaryWords + " (nie zaimplementowano) \n Ilość wyrazów w słowniku globalnym aplikacji: "
                + numberOfGlobalDictionaryWords + " (nie zaimplementowno)";

        return message;
     }
}