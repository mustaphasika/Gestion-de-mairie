package controller;

import Main.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.naissancegui;
public class ajouternaissance implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int ID1 = Integer.parseInt(naissancegui.id1.getText());
        int ID2 = Integer.parseInt(naissancegui.id2.getText());
        main.m.naissance(ID1, ID2);
        naissancegui.emptyfields();
    }
}
