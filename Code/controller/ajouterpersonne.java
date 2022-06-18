package controller;

import Main.main;
import view.saisirperseonnegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ajouterpersonne implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        main.m.saisirpersonne();
        saisirperseonnegui.emptyfields();
    }
}
