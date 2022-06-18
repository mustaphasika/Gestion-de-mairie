package classes;

import java.util.*;

public class Divorce {

  public Date ddiv;
  public Mairie mairie;
  public Mariage mar;

  public Divorce() {}

  public Divorce(Date ddiv, Mairie mairie, Mariage mar) {
    this.ddiv = ddiv;
    this.mairie = mairie;
    this.mar = mar;
  }
}
