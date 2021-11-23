package Konkurrence;

import Core.Parser;
import Diverse.Medlem;

import java.util.ArrayList;

public class Konkurrencestyring {
  ArrayList<Medlem> crawl = new ArrayList<>();
  ArrayList<Medlem> brystsvømning = new ArrayList<>();
  ArrayList<Medlem> rygsvømning = new ArrayList<>();
  ArrayList<Medlem> butterfly = new ArrayList<>();

  public void startKonkurrence() {

    Parser parser = new Parser();

    parser.getKonkurrenceMedlemmer();

    for (int i = 0; i < parser.getKonkurrenceMedlemmer().size(); i++) {
      if (parser.getKonkurrenceMedlemmer().get(i) ) {
        crawl.add()
      }
    }
  }
}
