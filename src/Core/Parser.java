package Core;
import java.util.Scanner;

public class Parser {

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
      String text = "Choose option: ";
      String[] items = {"1. View users list", "2. Create new user", "3. Delete user", "9. QUIT"};
      Menu ff = new Menu(header, items, text);
      ff.printMenu();
    }

    public void runMenu(){


    boolean flag = true;
    while(flag) {
      menuTest();

      switch (readChoice()) {
        case 1:
          //Hvad skal den?
          break;
        case 2:
          //Hvad skal den?
          break;
        case 3:
          // Hvad skal den??
          break;
        case 9:
          System.out.println("Exiting program");
          flag = false;
          break;
        default:
          System.out.println("\nNot a legal choice.. Rebooting....\n");
          try {
            Thread.sleep(1500);
          } catch (InterruptedException ex) {
            System.out.println("yooyo not working dawg");
          }
          break;
      }
    }
    }
  }
}