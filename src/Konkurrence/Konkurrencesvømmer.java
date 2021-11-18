package Konkurrence;

import Diverse.Medlem;

public class Konkurrencesvømmer extends Medlem {
  String disciplin1;
  String disciplin2;
  String disciplin3;
  String disciplin4;

  public Konkurrencesvømmer(String disciplin1, String medlemsskabsStatus, String navn, String email, String telefonnummer, int alder) {
    super(medlemsskabsStatus, navn, email, telefonnummer, alder);
    this.disciplin1 = disciplin1;
  }
  public Konkurrencesvømmer(String disciplin1, String disciplin2, String medlemsskabsStatus, String navn, String email, String telefonnummer, int alder) {
    super(medlemsskabsStatus, navn, email, telefonnummer, alder);
    this.disciplin1 = disciplin1;
    this.disciplin2 = disciplin2;
  }
  public Konkurrencesvømmer(String disciplin1, String disciplin2, String disciplin3, String medlemsskabsStatus, String navn, String email, String telefonnummer, int alder) {
    super(medlemsskabsStatus, navn, email, telefonnummer, alder);
    this.disciplin1 = disciplin1;
    this.disciplin2 = disciplin2;
    this.disciplin3 = disciplin3;
  }
  public Konkurrencesvømmer(String disciplin1, String disciplin2, String disciplin3, String disciplin4, String medlemsskabsStatus, String navn, String email, String telefonnummer, int alder) {
    super(medlemsskabsStatus, navn, email, telefonnummer, alder);
    this.disciplin1 = disciplin1;
    this.disciplin3 = disciplin2;
    this.disciplin3 = disciplin3;
    this.disciplin3 = disciplin4;
  }

}
