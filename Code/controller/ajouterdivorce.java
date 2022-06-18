package controller;

import Main.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.divorcegui;
public class ajouterdivorce implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        int i = Integer.parseInt(divorcegui.id.getText());
        main.m.divorce(i);
        divorcegui.emptyfields();

    }
}
