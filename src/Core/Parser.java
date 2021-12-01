package Core;
//Alle i gruppen har kodet denne klasse i fællesskab

import Diverse.Medlem;
import Konkurrence.Konkurrencesvømmer;
import java.util.ArrayList;

public class Parser {

  private ArrayList<Medlem> passiveMedlemmer = new ArrayList<>();
  private ArrayList<Medlem> juniorMedlemmer = new ArrayList<>();
  private ArrayList<Medlem> seniorMedlemmer = new ArrayList<>();
  private ArrayList<Medlem> senior60Medlemmer = new ArrayList<>();
  private ArrayList<Konkurrencesvømmer> konkurrenceMedlemmer = new ArrayList<>();

  public void sorterMedlemmer(ArrayList<Medlem> medlemmer) {
    konkurrenceMedlemmer.clear();
    juniorMedlemmer.clear();
    senior60Medlemmer.clear();
    seniorMedlemmer.clear();
    passiveMedlemmer.clear();

    for (int i = 0; i < medlemmer.size(); i++) {
      if (medlemmer.get(i) instanceof Konkurrencesvømmer) {
        konkurrenceMedlemmer.add((Konkurrencesvømmer) medlemmer.get(i));
      }
      if (medlemmer.get(i).getMedlemskabsStatus().equals("passivt")) {
        passiveMedlemmer.add(medlemmer.get(i));
      }
      if (medlemmer.get(i).getAlder() < 18 && medlemmer.get(i).getAlder() > 0) {
        juniorMedlemmer.add(medlemmer.get(i));
      } else if (medlemmer.get(i).getAlder() >= 18 && medlemmer.get(i).getAlder() < 60){
        seniorMedlemmer.add(medlemmer.get(i));
      } else if (medlemmer.get(i).getAlder() >= 60) {
        senior60Medlemmer.add(medlemmer.get(i));
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

  public ArrayList<Konkurrencesvømmer> getKonkurrenceMedlemmer() {
    return konkurrenceMedlemmer;
  }

}