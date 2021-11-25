package Diverse;

import Core.Controller;
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
          System.out.println("Wrong input. try again, enter a number: ");
          System.out.println(this.leadText);
        }
      }
      return scanner.nextInt();
    }

    public void menuTest() {
      System.out.println("\n");
      String header = "MENU:";
      String text = "Vælg menupunkt: ";
      String[] items = {"1. Registrer Medlem", "2. Gem Konkurrenceoplysninger", "3. Vis oversigt over topsvømmere",
          "9. QUIT"};
      Menu ff = new Menu(header, items, text);
      ff.printMenu();
    }

    public void runMenu() throws FileNotFoundException {


      boolean flag = true;
      while (flag) {
        menuTest();
        Konkurrencestyring konkurrencestyring = new Konkurrencestyring();

        switch (readChoice()) {
          case 1:
            Controller controller = new Controller();
            controller.lavMedlemsListe();
            break;
          case 2:
            angivKodeord();
            konkurrencestyring.startKonkurrence();
            break;
          case 3:
            angivKodeord();
            konkurrencestyring.visTopFem();
            break;
          case 9:
            System.out.println("Exiting program");
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

      while (!svar.equals(kodeord)) {
        for (int i = 0; i < 3; i++) {
          System.out.println("Forkert kodeord. Prøv igen. Du har " + (2 - i) + " forsøg tilbage");
          svar = in.nextLine();
          if (i == 1) {
            System.out.println("Du har opbrugt alle dine forsøg. Menu genindlæses.");
            runMenu();
          }
        }
      }
    }
}
