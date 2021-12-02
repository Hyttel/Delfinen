package Diverse;
//Alle i gruppen har kodet denne klasse i fællesskab

public abstract class Medlem {
  String medlemskabsStatus;
  String navn;
  String email;
  String telefonnummer;
  int alder;
  int pris;

  public Medlem (String medlemsskabsStatus, String navn, String email, String telefonnummer, int alder) {
    this.medlemskabsStatus = medlemsskabsStatus;
    this.navn = navn;
    this.email = email;
    this.telefonnummer = telefonnummer;
    this.alder = alder;
  }

  public Medlem (String navn){
  this.navn = navn;
  }

  public String getMedlemskabsStatus() {
    return medlemskabsStatus;
  }

  public String getNavn() {
    return navn;
  }

  public int getAlder() {
    return alder;
  }

  public void setPris(int pris) {
    this.pris = pris;
  }
  public int getPris() {
    return pris;
  }
}
