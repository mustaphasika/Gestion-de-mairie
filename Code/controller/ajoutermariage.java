package controller;

import Main.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.mariagegui;

public class ajoutermariage implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    int ID1 = Integer.parseInt(mariagegui.id1.getText());
    int ID2 = Integer.parseInt(mariagegui.id2.getText());
    main.m.mariage(ID1, ID2);
    mariagegui.emptyfields();
  }
}
