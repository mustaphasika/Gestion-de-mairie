package controller;

import Main.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.etatpersonnegui;

public class etatpersonne implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    main.m.afficheretatpersonne(Integer.parseInt(etatpersonnegui.id.getText()));
    etatpersonnegui.emptyfields();
  }
}
