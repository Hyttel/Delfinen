package Diverse;

import Core.Controller;
import Core.Parser;
import Konkurrence.Konkurrencestyring;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    private String menuHeader;
    private String[] menuItems;
    private String leadText;

    public Menu(String header, String[] items, String text) {
      menuHeader = header;
      menuItems = items;
      leadText = text;
    }

    public Menu() {

    }

    public void printMenu() {
      for (String s : menuItems) {
        System.out.println(s);
      }
      System.out.print("\n" + leadText);
    }

    public int readChoice() {
      Scanner scanner = new Scanner(System.in);
      if (!scanner.hasNextInt()) {
        while (!scanner.hasNextInt()) {
          System.out.println("Forkert indtastning, indtast et nummer:");
          scanner.next();
        }
      }
      return scanner.nextInt();
    }

    public void menuTest() {
      System.out.println("\n");
      String header = "MENU:";
      String text = "Vælg menupunkt: ";
      String[] items = {"""
          1. Registrer Medlem
          2. Gem Konkurrenceoplysninger
          3. Vis oversigt over topsvømmere
          4. Vis klubbens regnskab
          9. Afslut program
          """};
      Menu ff = new Menu(header, items, text);
      ff.printMenu();
    }

    public void runMenu() throws FileNotFoundException {

      Konkurrencestyring konkurrencestyring = new Konkurrencestyring();
      Controller controller = new Controller();
      Parser parser = new Parser();
      Regnskab regnskab = new Regnskab();

      boolean flag = true;

      while (flag) {
        menuTest();

        switch (readChoice()) {
          case 1:
            controller.lavMedlemsListe();
            parser.sorterMedlemmer(controller.getMedlemmer());
            break;
          case 2:
            angivKodeord();
            konkurrencestyring.sorterDisciplin(parser.getKonkurrenceMedlemmer());
            konkurrencestyring.startKonkurrence();
            break;
          case 3:
            angivKodeord();
            konkurrencestyring.visTopFem();
            break;
          case 4:
            angivRegnskabsKodeord();
            System.out.println("Vælg et af følgende punkter: \n1. Restance\n2. Forretning");
            Scanner in = new Scanner(System.in);
            int svar = in.nextInt();
            if (svar == 1) {
              regnskab.visRestance(controller.getMedlemmer());
            } else if (svar == 2) {
              regnskab.visForretning(controller.getMedlemmer());
            }
            break;
          case 9:
            System.out.println("Afslutter programmet");
            flag = false;
            break;
        }
      }
    }

    private void angivKodeord() throws FileNotFoundException {
      String kodeord = "sortsol12";
      Scanner in = new Scanner(System.in);

      System.out.println("Indtast kodeord");
      String svar = in.nextLine();

      int i = 3;

      while (!svar.equals(kodeord)) {
          System.out.println("Forkert kodeord. Prøv igen.. Du har " + (i - 1) + " forsøg tilbage");
          svar = in.nextLine();
          i = i - 1;

          if (i == 0) {
            System.out.println("Du har opbrugt alle dine forsøg. Menu genindlæses.");
            runMenu();
          }
        }
      }

  private void angivRegnskabsKodeord() throws FileNotFoundException {
    String kodeord = "hvidsol12";
    Scanner in = new Scanner(System.in);

    System.out.println("Indtast kodeord");
    String svar = in.nextLine();

    int i = 3;

    while (!svar.equals(kodeord)) {
      System.out.println("Forkert kodeord. Prøv igen.. Du har " + (i - 1) + " forsøg tilbage");
      svar = in.nextLine();
      i = i - 1;

      if (i == 0) {
        System.out.println("Du har opbrugt alle dine forsøg. Menu genindlæses.");
        runMenu();
      }
    }
  }
    }

