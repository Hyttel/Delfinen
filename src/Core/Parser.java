package Core;

import Diverse.Medlem;
import Konkurrence.Konkurrencesvømmer;

import java.util.ArrayList;
import java.util.Collections;

public class Parser {
  Controller controller = new Controller();

  private ArrayList<Medlem> passiveMedlemmer = new ArrayList<>();
  private ArrayList<Medlem> juniorMedlemmer = new ArrayList<>();
  private ArrayList<Medlem> seniorMedlemmer = new ArrayList<>();
  private ArrayList<Medlem> senior60Medlemmer = new ArrayList<>();
  private ArrayList<Konkurrencesvømmer> konkurrenceMedlemmer = new ArrayList<>();

  public void sorterMedlemmer() {

    for (int i = 0; i < controller.getMedlemmer().size(); i++) {
      if (controller.getMedlemmer().get(i) instanceof Konkurrencesvømmer) {
        konkurrenceMedlemmer.add((Konkurrencesvømmer) controller.getMedlemmer().get(i));
      }
      if (controller.getMedlemmer().get(i).getMedlemskabsStatus().equals("passivt")) {
        passiveMedlemmer.add(controller.getMedlemmer().get(i));
      }
      if (controller.getMedlemmer().get(i).getAlder() < 18 && controller.getMedlemmer().get(i).getAlder() > 0) {
        juniorMedlemmer.add(controller.getMedlemmer().get(i));
      } else if (controller.getMedlemmer().get(i).getAlder() >= 18 && controller.getMedlemmer().get(i).getAlder() < 60){
        seniorMedlemmer.add(controller.getMedlemmer().get(i));
      } else if (controller.getMedlemmer().get(i).getAlder() >= 60) {
        senior60Medlemmer.add(controller.getMedlemmer().get(i));
      }
    }
  }

  public ArrayList<Medlem> getPassiveMedlemmer() {
    return passiveMedlemmer;
  }

  public ArrayList<Medlem> getJuniorMedlemmer() {
    return juniorMedlemmer;
  }

  public ArrayList<Medlem> getSeniorMedlemmer() {
    return seniorMedlemmer;
  }

  public ArrayList<Medlem> getSenior60Medlemmer() {
    return senior60Medlemmer;
  }

  public ArrayList<Medlem> getKonkurrenceMedlemmer() {
    return konkurrenceMedlemmer;
  }

}