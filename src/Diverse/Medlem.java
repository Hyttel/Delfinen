package Diverse;
// Alle i gruppen har kodet denne klasse

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

  public void setMedlemskabsStatus(String medlemskabsStatus) {
    this.medlemskabsStatus = medlemskabsStatus;
  }
  public String getMedlemskabsStatus() {
    return medlemskabsStatus;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }
  public String getNavn() {
    return navn;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail() {
    return email;
  }

  public void setTelefonnummer(String telefonnummer) {
    this.telefonnummer = telefonnummer;
  }
  public String getTelefonnummer() {
    return telefonnummer;
  }

  public void setAlder(int alder) {
    this.alder = alder;
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