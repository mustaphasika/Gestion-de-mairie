package classes;

import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.*;
import view.etatpersonnegui;
import view.listpersonnegui;

public class Personne {

  public int id;
  public String nom;
  public String prenom;
  public Date dnaiss;
  public String etciv;
  public String adresse;
  public Naissance naiss;
  public String sexe;

  public Personne() {}

  public Personne(
      int id,
      String nom,
      String prenom,
      String sexe,
      Date dnaiss,
      String etciv,
      String adresse,
      Naissance naiss) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.dnaiss = dnaiss;
    this.etciv = etciv;
    this.adresse = adresse;
    this.naiss = naiss;
    this.sexe = sexe;
  }

  public void etat() {
    System.out.println("l'état de la personne" + this.nom + this.prenom + " est: " + this.etciv);
  }



  public void afficherinfo1() {
    DefaultTableModel tableModel = (DefaultTableModel) etatpersonnegui.table.getModel();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String data[] = {
            String.valueOf(this.id), this.nom, this.prenom, this.sexe, formatter.format(this.dnaiss)
    };
    tableModel.addRow(data);
  }
  public void afficherinfo2() {
    DefaultTableModel tableModel = (DefaultTableModel) listpersonnegui.table.getModel();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String data[] = {
            String.valueOf(this.id), this.nom, this.prenom, this.sexe, formatter.format(this.dnaiss)
    };
    tableModel.addRow(data);
  }
}
