package classes;

import view.divorcegui;
import view.saisirperseonnegui;
import view.mariagegui;
import javax.swing.*;
import view.naissancegui;

import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.*;
import view.etatpersonnegui;
import view.listpersonnegui;

public class Mairie {

  public String nomm;
  public Vector<Divorce> listdiv;
  public Vector<Mariage> listMar;
  public Vector<Naissance> listNaiss;
  public Vector<Homme> listhm;
  public Vector<Femme> listfm;
  public Vector<Personne> listCit;


  public Mairie(
      String nomm,
      Vector<Divorce> listdiv,
      Vector<Mariage> listMar,
      Vector<Naissance> listNaiss,
      Vector<Homme> listhm,
      Vector<Femme> listfm,
      Vector<Personne> listCit) {
    this.nomm = nomm;
    this.listdiv = listdiv;
    this.listMar = listMar;
    this.listNaiss = listNaiss;
    this.listhm = listhm;
    this.listfm = listfm;
    this.listCit = listCit;
  }

  public Mairie(String nomm) {
    this.nomm = nomm;
    this.listdiv = new Vector<Divorce>();
    this.listMar = new Vector<Mariage>();
    this.listNaiss = new Vector<Naissance>();
    this.listhm = new Vector<Homme>();
    this.listfm = new Vector<Femme>();
    this.listCit = new Vector<Personne>();
  }
  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

  public boolean existe(String n, String p, String d) {
    int i = 0;
    while (i < listCit.size()) {
      if ((trouvercit(i).nom.equals(n)) && (trouvercit(i).prenom.equals(p)) && (formatter.format(trouvercit(i).dnaiss).equals( d))) {
        return true;
      }
      i++;
    }
    return false;

  }


  public void ajoutercitoyen(Personne p) {
    this.listCit.add(p);
  }

  public void ajouterhomme(Homme h) {
    listhm.add(h);
  }

  public void ajouterfemme(Femme f) {
    listfm.add(f);
  }

  public void ajoutermariage(Mariage m) {
    listMar.add(m);
  }

  public void ajouternaissance(Naissance n) {
    listNaiss.add(n);
  }

  public void ajouterdivorce(Divorce d) {
    listdiv.add(d);
  }

  public Mariage trouvermar(int id) {
    int i = 0;
    while (i < listMar.size()) {
      if (((listMar.get(i).mari??.id == id) || (listMar.get(i).mari??e.id == id))
          && (listMar.get(i).div == null)) {
        return (listMar.get(i));
      }
      i++;
    }
    return null;
  }

  public Personne trouvercit(int id) {

    int i = 0;

    while (i < listCit.size()) {
      if (listCit.get(i).id == id) {
        return (listCit.get(i));
      }
      i++;
    }
    return null;
  }

  public Homme trouverhm(int id) {
    int i = 0;
    while (i < listhm.size()) {
      if (listhm.get(i).id == id) {
        return (listhm.get(i));
      }
      i++;
    }
    return null;
  }

  public Femme trouverfm(int id) {
    int i = 0;
    while (i < listfm.size()) {
      if (listfm.get(i).id == id) {
        return (listfm.get(i));
      }
      i++;
    }
    return null;
  }

  public String etatpersonne(int id) {
    return (trouvercit(id).etciv);
  }

  public void mariage(int id1, int id2) {
    if (trouvercit(id1) == null) {

      JOptionPane.showMessageDialog(
          null, "la premiere personne n'existe pas", "Erreur", JOptionPane.ERROR_MESSAGE);

    } else if (etatpersonne(id1) == "Mari??(e)") {
      System.out.println("la premiere personne est d??ja mari??e");
      JOptionPane.showMessageDialog(
          null, "la premiere personne est d??ja mari??e", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    if (trouvercit(id2) == null) {
      System.out.println("la deuxieme personne n'existe pas");
      JOptionPane.showMessageDialog(
          null, "la deuxieme personne n'existe pas", "Erreur", JOptionPane.ERROR_MESSAGE);
    } else if (etatpersonne(id2) == "Mari??(e)") {
      System.out.println("la deuxieme personne est d??ja mari??e");
      JOptionPane.showMessageDialog(
          null, "la deuxieme personne est d??ja mari??e", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    if (((trouvercit(id1) != null) && (trouvercit(id2) != null))
        && ((etatpersonne(id1) != "Mari??e") && (etatpersonne(id2) != "Mari??e"))) {
      trouvercit(id1).etciv = "Mari??(e)";
      trouvercit(id2).etciv = "Mari??(e)";
      System.out.println("entrez la date de mariage en format aaaa/mm/jj s.v.p");
      Date datemar = new Date();
      System.out.println("entrez le lieu de mariage s.v.p");
      String lieumar = mariagegui.lieumar.getText();
      if (trouverhm(id1) == null) {
        Mariage m = new Mariage(datemar, lieumar, this, null, trouverhm(id2), trouverfm(id1));
        trouverhm(id2).Listmar.add(m);
        trouverfm(id1).Listmar.add(m);
        ajoutermariage(m);
        JOptionPane.showInternalMessageDialog(
            null, "mariage ajout??", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

      } else {
        Mariage m = new Mariage(datemar, lieumar, this, null, trouverhm(id1), trouverfm(id2));
        trouverhm(id1).Listmar.add(m);
        trouverfm(id2).Listmar.add(m);
        ajoutermariage(m);
        JOptionPane.showInternalMessageDialog(
            null, "mariage ajout??", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }
  ;

  public void divorce(int id) {
    if (trouvercit(id) == null) {
      JOptionPane.showMessageDialog(
          null, "Cette personne n'existe pas", "Erreur", JOptionPane.ERROR_MESSAGE);
      System.out.println("cette personne n'existe pas");
    } else if (etatpersonne(id).equals("Divorc??(e)")) {
      JOptionPane.showMessageDialog(
          null, "Cette personne est d??ja divorc??e", "Erreur", JOptionPane.ERROR_MESSAGE);
      System.out.println("cette personne est Divorc??e");
    } else if (etatpersonne(id).equals("C??libataire")) {
      JOptionPane.showMessageDialog(
          null, "Cette persone est c??libataire", "Erreur", JOptionPane.ERROR_MESSAGE);
      System.out.println("cette personne est C??libataire");
    } else {
      trouvercit(id).etciv.equals("Divorc??(e)");
      System.out.println("entrez la date de divorce en format aaaa/mm/jj s.v.p");
      Date datedivorce = divorcegui.ddivorce.getDate();
      Divorce divorce = new Divorce(datedivorce, this, trouvermar(id));
      ajouterdivorce(divorce);
      trouvermar(id).mari??e.etciv = "Divorc??(e)";
      trouvermar(id).mari??.etciv = "Divorc??(e)";
      trouvermar(id).div = divorce;
      JOptionPane.showInternalMessageDialog(
          null, "Success", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
  }
  ;
  public void saisirpersonne() {
    if (existe(
        saisirperseonnegui.nom.getText(),
        saisirperseonnegui.pr??nom.getText(),
        formatter.format(saisirperseonnegui.dnaissance.getDate()))) {
      JOptionPane.showInternalMessageDialog(
          null, "Cette personne existe d??ja", "Erreur", JOptionPane.ERROR_MESSAGE);
    } else {
      int id;
      if (listCit.isEmpty()) {
        id = 0;
      } else {
        id = listCit.lastElement().id + 1;
      }
     // System.out.println("entrez le nom de la personne s.v.p");
      String nom = saisirperseonnegui.nom.getText();
      //System.out.println("entrez le pr??nom de la personne s.v.p");
      String prenom = saisirperseonnegui.pr??nom.getText();
     // System.out.println("entrez le sexe de la personne s.v.p");
      String sexe = saisirperseonnegui.sexe.getSelectedItem().toString();
      //System.out.println("entrez la date de naissance en format aaaa/mm/jj s.v.p");
      // String dnaissance = saisirperseonnegui.dnaissance.getText();
      Date datenaissance = saisirperseonnegui.dnaissance.getDate();
      //System.out.println("entrez l'??tat civil");
      String etatcivil = saisirperseonnegui.etatc.getSelectedItem().toString();
      System.out.println("-------------------------" + etatcivil + "-------------------");
     // System.out.println("entrez l'adresse");
      String adr = saisirperseonnegui.adr.getText();
      if (sexe.equals("Homme")) {
        Homme personne =
            new Homme(id, nom, prenom, sexe, datenaissance, etatcivil, adr, null, this);
        this.ajoutercitoyen(personne);
        this.ajouterhomme(personne);
        JOptionPane.showInternalMessageDialog(
            null, "Personne ajout??e", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
      }
      if (sexe.equals("Femme")) {
        Femme personne =
            new Femme(id, nom, prenom, sexe, datenaissance, etatcivil, adr, null, this);
        this.ajoutercitoyen(personne);
        this.ajouterfemme(personne);
        JOptionPane.showInternalMessageDialog(
            null, "Personne ajout??e", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }
  ;

  public void naissance(int id1, int id2) {
    if (trouvercit(id1) == null) {
      JOptionPane.showMessageDialog(
          null, "la premiere personne n'existe pas", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    if (trouvercit(id2) == null) {
      JOptionPane.showMessageDialog(
          null, "la deuxieme personne n'existe pas", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    if (((trouvercit(id1) != null) && (trouvercit(id2)) != null)) {
      System.out.println("Entrez le lieu de naissance");
      String lieunaissance = naissancegui.lieun.getText();
      // System.out.println("entrez la date de naissance en format aaaa/mm/jj s.v.p");
      // String dnaissance = sc.next();
      // sc.nextLine();
      Date dateenregistrement = new Date();
      if (trouverhm(id1) == null) {
        saisirperseonnegui n = new saisirperseonnegui();
        n.addWindowListener(
            new java.awt.event.WindowAdapter() {
              @Override
              public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                Naissance nvn =
                    new Naissance(
                        lieunaissance,
                        dateenregistrement,
                        listCit.lastElement(),
                        trouverhm(id2),
                        trouverfm(id1)); // lieu
                ajouternaissance(nvn);
                listCit.lastElement().naiss = nvn;
                trouverhm(id2).enfants.add(nvn);
                trouverfm(id1).enfants.add(nvn);
                JOptionPane.showInternalMessageDialog(
                    null,
                    "nouveau n??(e) ajout??(e)",
                    "Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
              }
            });
        n.setVisible(true);

      } else {
        saisirperseonnegui n = new saisirperseonnegui();
        n.addWindowListener(
            new java.awt.event.WindowAdapter() {
              @Override
              public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                Naissance nvn =
                    new Naissance(
                        lieunaissance,
                        dateenregistrement,
                        listCit.lastElement(),
                        trouverhm(id1),
                        trouverfm(id2));
                ajouternaissance(nvn);
                listCit.lastElement().naiss = nvn;
                trouverhm(id1).enfants.add(nvn);
                trouverfm(id2).enfants.add(nvn);
                JOptionPane.showInternalMessageDialog(
                    null,
                    "nouveau n??(e) ajout??(e)",
                    "Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
              }
            });
        n.show();
      }
    }
  }

  public void afficheretatpersonne(int id) {
    if (trouvercit(id) == null) {
      JOptionPane.showMessageDialog(
          null, "Cette perssone n'exite pas ", "Erreur", JOptionPane.ERROR_MESSAGE);

      System.out.println("la personne n'existe pas");
    } else {
      DefaultTableModel tableModel = (DefaultTableModel) etatpersonnegui.table.getModel();
      trouvercit(id).afficherinfo1();
      if (etatpersonne(id).equals("Mari??(e)")) {
        if (trouverhm(id) != null) {
          System.out.println("les informations de son conjoint sont:");
          tableModel.setValueAt(trouvermar(id).mari??e.nom, tableModel.getRowCount() - 1, 5);
          tableModel.setValueAt(trouvermar(id).mari??e.prenom, tableModel.getRowCount() - 1, 6);
          System.out.println("nom: " + trouvermar(id).mari??e.nom);
          System.out.println("pr??nom: " + trouvermar(id).mari??e.prenom);
        } else {
          System.out.println("les informations de son conjoint sont:");
          tableModel.setValueAt(trouvermar(id).mari??.nom, tableModel.getRowCount() - 1, 5);
          tableModel.setValueAt(trouvermar(id).mari??.prenom, tableModel.getRowCount() - 1, 6);
          System.out.println("nom: " + trouvermar(id).mari??.nom);
          System.out.println("pr??nom: " + trouvermar(id).mari??.prenom);
        }
      }
    }
  }

  public void listpersonne() {
    for (int id = 0; id < listCit.size(); id++) {
      DefaultTableModel tableModel = (DefaultTableModel) listpersonnegui.table.getModel();
      trouvercit(id).afficherinfo2();
      if (etatpersonne(id).equals("Mari??(e)")) {
        if (trouverhm(id) != null) {
          System.out.println("les informations de son conjoint sont:");
          tableModel.setValueAt(trouvermar(id).mari??e.nom, tableModel.getRowCount() - 1, 5);
          tableModel.setValueAt(trouvermar(id).mari??e.prenom, tableModel.getRowCount() - 1, 6);
          System.out.println("nom: " + trouvermar(id).mari??e.nom);
          System.out.println("pr??nom: " + trouvermar(id).mari??e.prenom);
        } else {
          System.out.println("les informations de son conjoint sont:");
          tableModel.setValueAt(trouvermar(id).mari??.nom, tableModel.getRowCount() - 1, 5);
          tableModel.setValueAt(trouvermar(id).mari??.prenom, tableModel.getRowCount() - 1, 6);
          System.out.println("nom: " + trouvermar(id).mari??.nom);
          System.out.println("pr??nom: " + trouvermar(id).mari??.prenom);
        }
      }
    }
  }
}
;


  /*public void listpersonne() {
      for (int i = 0; i < listCit.size(); i++) {
        afficheretatpersonne(listCit.get(i).id);
      }
    }
  }
  ;*/
