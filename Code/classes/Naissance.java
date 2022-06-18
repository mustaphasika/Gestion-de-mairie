package classes;

import java.util.*;

public class Naissance extends Personne {

  public String lieun;
  public Date daten;
  public Personne nouveauné;
  public Homme pere;
  public Femme Mere;

  public Naissance() {}

  public Naissance(String lieun, Date daten, Personne nouveauné, Homme pere, Femme mere) {
    this.lieun = lieun;
    this.daten = daten;
    this.nouveauné = nouveauné;
    this.pere = pere;
    Mere = mere;
  }
}
