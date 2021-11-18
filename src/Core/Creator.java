package Core;

import Diverse.Medlem;
import java.util.Scanner;

public class Creator {

  public Medlem opretMedlem() {
    System.out.println("Oprettelse af medlemskab:\n\n");
    Scanner in = new Scanner(System.in);

    String statusSvar;
    do {
      System.out.println("Aktivt eller passivt medlemskab: ");
      statusSvar = in.nextLine();
    } while (!statusSvar.equalsIgnoreCase("aktivt") && !statusSvar.equalsIgnoreCase("passivt"));

    System.out.println("Navn: ");
    String navnSvar = in.nextLine();

    System.out.println("Alder: ");
    int alderSvar = in.nextInt();

    String emailSvar;
    do {
      System.out.println("Email: ");
      emailSvar = in.nextLine();
    } while (!emailSvar.contains("@"));

    System.out.println("Telefonnummer: ");
    String telefonnummerSvar = in.nextLine();

    Medlem medlem = new Medlem(statusSvar, navnSvar, emailSvar, telefonnummerSvar, alderSvar);

    return medlem;
  }
}
