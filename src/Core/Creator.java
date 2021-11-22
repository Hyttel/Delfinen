package Core;

import Diverse.Medlem;
import Diverse.Motionist;
import Konkurrence.Konkurrencesvømmer;

import java.util.Locale;
import java.util.Scanner;


public class Creator {

  public Medlem opretMedlem() {
    System.out.println("---------Oprettelse af medlemskab----------\n");
    Scanner in = new Scanner(System.in);
    Medlem medlem = null;

    String statusSvar;
    do {
      System.out.println("Aktivt eller passivt medlemskab: ");
      statusSvar = in.nextLine().toLowerCase().trim();;
    } while (!statusSvar.equalsIgnoreCase(  "aktivt") && !statusSvar.equalsIgnoreCase("passivt"));

    System.out.println("Navn: ");
    String navnSvar = in.nextLine();

    System.out.println("Alder: ");
    int alderSvar = in.nextInt();
    in.nextLine();

    String emailSvar;
    do {
      System.out.println("Email: ");
      emailSvar = in.nextLine();
    } while (!emailSvar.contains("@"));

    System.out.println("Telefonnummer: ");
    String telefonnummerSvar = in.nextLine();

    String konkurrenceSvømmer;
    do {
      System.out.println("tilmeldes som Konkurrencesvømmer? ja/nej");
      konkurrenceSvømmer = in.nextLine().trim();
    } while (!konkurrenceSvømmer.equalsIgnoreCase("ja")
        && !konkurrenceSvømmer.equalsIgnoreCase("nej"));

    if (konkurrenceSvømmer.equalsIgnoreCase("ja")){
      System.out.println("Hvor mange disipliner deltages der i? ");
      int antalDiscipliner;
      antalDiscipliner = in.nextInt();
      if (antalDiscipliner == 1) {
        System.out.println("Hvilken disiplin deltages der i? - butterfly, crawl, rygcrawl eller brystsvømning");
        String disciplin1 = in.nextLine().toLowerCase().trim();;
        medlem = new Konkurrencesvømmer(disciplin1, statusSvar, navnSvar, emailSvar, telefonnummerSvar, alderSvar);
      }
      else if (antalDiscipliner == 2) {
        System.out.println("Hvilke disipliner deltages der i? - butterfly, crawl, rygcrawl eller brystsvømning");
        String disciplin1 = in.nextLine().toLowerCase().trim();
        System.out.println("nummer 2 disciplin?");
        String disciplin2 = in.nextLine().toLowerCase().trim();;
        medlem = new Konkurrencesvømmer(disciplin1,disciplin2, statusSvar, navnSvar, emailSvar, telefonnummerSvar, alderSvar);
      }
      else if (antalDiscipliner == 3) {
        System.out.println("Hvilken disiplin deltages der i? - butterfly, crawl, rygcrawl eller brystsvømning");
        String disciplin1 = in.nextLine().toLowerCase().trim();;
        System.out.println("nummer 2 disciplin?");
        String disciplin2 = in.nextLine().toLowerCase().trim();;
        System.out.println("nummer 3 disciplin?");
        String disciplin3 = in.nextLine().toLowerCase().trim();;
        medlem = new Konkurrencesvømmer(disciplin1, disciplin2, disciplin3, statusSvar, navnSvar, emailSvar, telefonnummerSvar, alderSvar);
      }
      else if (antalDiscipliner == 4) {
        System.out.println("Medlemmet er blevet tilmeldt alle 4 discipliner.");
        medlem = new Konkurrencesvømmer("butterfly", "crawl", "rygcrawl", "brystsvømning", statusSvar, navnSvar, emailSvar, telefonnummerSvar, alderSvar);
      }
    } else if (konkurrenceSvømmer.equalsIgnoreCase("nej")){
      medlem = new Motionist(statusSvar,navnSvar,emailSvar,telefonnummerSvar,alderSvar);
    }

    return medlem;
    //Alt efter hvordan brugeren har svaret bliver der oprettet et "Medlem". Denne kan efterfølgende
    //lægges i specifikke ArrayLists baseret på svar.
  }
}
