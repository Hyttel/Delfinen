package Diverse;
//Alle i gruppen har kodet denne klasse i fællesskab

import java.util.ArrayList;

public class Regnskab {

  public void visRestance(ArrayList<Medlem> restance) {
    for (int i = 0; i < restance.size(); i++) {
      System.out.println(restance.get(i).getNavn() + " mangler at betale: " +
          restance.get(i).getPris() + " kr.\n");
    }
  }

  public void visForretning(ArrayList<Medlem> forretning) {

    int samledeKontigent = 0;
    for (int i = 0; i < forretning.size(); i++) {
      samledeKontigent = samledeKontigent + forretning.get(i).getPris();
    }
    System.out.println("Den årlige omsætning for det samlede kontigent af klubbens medlemmer: " + samledeKontigent);
  }

}
