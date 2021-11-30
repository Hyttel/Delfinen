package Core;

import Diverse.Medlem;
import java.util.ArrayList;

public class Controller {

  ArrayList<Medlem> medlemmer = new ArrayList<>();

  public ArrayList<Medlem> getMedlemmer() {
    return medlemmer;
  }

  public void lavMedlemsListe() {

    Creator creator = new Creator();
    Medlem nytMedlem = creator.opretMedlem();
    angivPris(nytMedlem);
    medlemmer.add(nytMedlem);
    System.out.println("Årlige medlemskabskontigent: " + nytMedlem.getPris() + " kr.");
  }

  public void angivPris(Medlem medlem) {

    if (medlem.getMedlemskabsStatus().equalsIgnoreCase("passivt")) {
      medlem.setPris(500);
    } else if (medlem.getAlder() >= 60) {
      medlem.setPris((int) (1600*0.75));
    } else if (medlem.getAlder() < 60 && medlem.getAlder() >= 18) {
      medlem.setPris(1600);
    } else if (medlem.getAlder() < 18) {
      medlem.setPris(1000);
    }
  }
}
