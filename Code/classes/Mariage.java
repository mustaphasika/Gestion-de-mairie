package classes;

import java.util.*;

public class Mariage {

  public Date dmar;
  public String Lieum;
  public Mairie mairie;
  public Divorce div;
  public Homme marié;
  public Femme mariée;

  public Mariage() {}

  public Mariage(Date dmar, String lieum, Mairie mairie, Divorce div, Homme marié, Femme mariée) {
    this.dmar = dmar;
    this.Lieum = lieum;
    this.mairie = mairie;
    this.div = div;
    this.marié = marié;
    this.mariée = mariée;
  }
}
