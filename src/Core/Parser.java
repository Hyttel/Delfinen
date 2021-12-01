package Core;

import Diverse.Medlem;
import Konkurrence.Konkurrencesvømmer;
import java.util.ArrayList;

public class Parser {

  private ArrayList<Konkurrencesvømmer> konkurrenceMedlemmer = new ArrayList<>();

  public void sorterMedlemmer(ArrayList<Medlem> medlemmer) {
    konkurrenceMedlemmer.clear();

    for (int i = 0; i < medlemmer.size(); i++) {
      if (medlemmer.get(i) instanceof Konkurrencesvømmer) {
        konkurrenceMedlemmer.add((Konkurrencesvømmer) medlemmer.get(i));
      }
    }
  }

  public ArrayList<Konkurrencesvømmer> getKonkurrenceMedlemmer() {
    return konkurrenceMedlemmer;
  }

}