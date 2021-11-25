package Konkurrence;

import Diverse.Medlem;

public class Konkurrencesvømmer extends Medlem implements Comparable<Konkurrencesvømmer>{
  String disciplin1;
  String disciplin2;
  String disciplin3;
  String disciplin4;
  double tid;

  public Konkurrencesvømmer(String navn, double tid){
    super(navn);
    this.tid = tid;
  }

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
    this.disciplin2 = disciplin2;
    this.disciplin3 = disciplin3;
    this.disciplin4 = disciplin4;
  }

  public void setTid(double tid) {
    this.tid = tid;
  }

  public double getTid() {
    return tid;
  }

  public String getDisciplin1() {
    return disciplin1;
  }

  public String getDisciplin2() {
    return disciplin2;
  }

  public String getDisciplin3() {
    return disciplin3;
  }

  public String getDisciplin4() {
    return disciplin4;
  }

  @Override
  public int compareTo(Konkurrencesvømmer o) {
    if (this.tid < o.tid) {
      return - 1;
    }if (this.tid == o.tid) {
      return 0;
    } else {
      return 1;
    }
  }
}
