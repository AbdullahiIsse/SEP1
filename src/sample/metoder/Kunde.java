package sample.metoder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Kunde")
public class Kunde
{
  private String Fornavn, Efternavn;
  private int Telefonnummer;

  public Kunde(String fornavn, String efternavn, int telefonnummer)
  {
    Fornavn = fornavn;
    Efternavn = efternavn;
    Telefonnummer = telefonnummer;
  }
  @XmlElement(name = "Fornavn")
  public String getFornavn() {
    return Fornavn;
  }

  public void setFornavn(String fornavn) {
    Fornavn = fornavn;
  }
  @XmlElement(name = "Efternavn")
  public String getEfternavn() {
    return Efternavn;
  }

  public void setEfternavn(String efternavn) {
    Efternavn = efternavn;
  }
  @XmlElement(name = "Telefonnummer")
  public int getTelefonnummer() {
    return Telefonnummer;
  }

  public void setTelefonnummer(int telefonnummer) {
    Telefonnummer = telefonnummer;
  }
}
