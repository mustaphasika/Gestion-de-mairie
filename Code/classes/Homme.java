package classes;

import java.util.*;

public class Homme extends Personne {

  public Vector<Mariage> Listmar;
  public Vector<Naissance> enfants;
  public Mairie mairie;

  public Homme() {}

  public Homme(Mairie mairie) {
    Listmar = new Vector<Mariage>();
    this.enfants = new Vector<Naissance>();
    this.mairie = mairie;
  }

  public Homme(
      int id,
      String nom,
      String prenom,
      String sexe,
      Date dnaiss,
      String etciv,
      String adresse,
      Naissance naiss,
      Mairie mairie) {
    super(id, nom, prenom, sexe, dnaiss, etciv, adresse, naiss);
    this.mairie = mairie;
    Listmar = new Vector<Mariage>();
    this.enfants = new Vector<Naissance>();
  }
}
