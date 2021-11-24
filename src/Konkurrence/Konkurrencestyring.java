package Konkurrence;

import Core.Parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;


public class Konkurrencestyring {
  ArrayList<Konkurrencesvømmer> crawl = new ArrayList<>();
  ArrayList<Konkurrencesvømmer> brystsvømning = new ArrayList<>();
  ArrayList<Konkurrencesvømmer> rygsvømning = new ArrayList<>();
  ArrayList<Konkurrencesvømmer> butterfly = new ArrayList<>();

  try {
  PrintStream printCrawlFile = new PrintStream(crawlFile);
  PrintStream printBrystFile = new PrintStream(brystFile);
  PrintStream printRygFile = new PrintStream(rygFile);
  PrintStream printButterfly = new PrintStream(butterflyFile);

  } catch (IOException e) {
    System.out.println("Fejl");
  }

  String crawlFile = "topCrawl.txt";
  String brystFile = "topBryst.txt";
  String rygFile = "topRyg.txt";
  String butterflyFile = "topButterfly.txt";

  boolean konkurrenceErIGang = true;
  Scanner in = new Scanner(System.in);
  Stopur stopur = new Stopur();

  public void startKonkurrence() {

    Konkurrencesvømmer Jens = new Konkurrencesvømmer("crawl", "aktivt", "jens", "asd@ad.dk", "12", 12);
    Konkurrencesvømmer Peter = new Konkurrencesvømmer("crawl", "aktivt", "Bo", "asd@ad.dk", "12", 12);
    Konkurrencesvømmer asda = new Konkurrencesvømmer("crawl", "aktivt", "Chautelle", "asd@ad.dk", "12", 12);
    Konkurrencesvømmer ko = new Konkurrencesvømmer("brystsvømning", "aktivt", "Kim", "asd@ad.dk", "12", 12);
    Konkurrencesvømmer se = new Konkurrencesvømmer("butterfly", "aktivt", "Luderso", "asd@ad.dk", "12", 12);
    Konkurrencesvømmer kylling = new Konkurrencesvømmer("rygsvømning", "aktivt", "Henning", "asd@ad.dk", "12", 12);
    Konkurrencesvømmer gris = new Konkurrencesvømmer("butterfly", "aktivt", "Kennete", "asd@ad.dk", "12", 12);

    brystsvømning.add(ko);
    butterfly.add(se);
    rygsvømning.add(kylling);
    butterfly.add(gris);
    crawl.add(Jens);
    crawl.add(Peter);
    crawl.add(asda);
    while (konkurrenceErIGang) {
      System.out.println("Hvilken disciplin vil du tage tid på?\n" +
          """
              1. Crawl
              2. Brystsvømning
              3. Rygsvømning
              4. Butterfly
              5. Tilbage til hovedmenu""");
      int beslutning = in.nextInt();
      try {
        switch (beslutning) {
          case 1:
            System.out.println("Hvilken atlet vil du tage tid på?");
            for (int i = 0; i < crawl.size(); i++) {
              System.out.println((i + 1) + ": " + crawl.get(i).getNavn());
            }
            int valg = in.nextInt();
            System.out.println("Du har valgt " + crawl.get(valg - 1).getNavn());
            in.nextLine();
            double tidCrawl = tagTid();
            System.out.println("tid: " + tidCrawl + " sekunder");
            crawl.get(valg - 1).setTid(tidCrawl);
            skrivTilFil();
            break;
          case 2:
            System.out.println("Hvilken atlet vil du tage tid på?");
            for (int i = 0; i < brystsvømning.size(); i++) {
              System.out.println((i + 1) + ": " + brystsvømning.get(i).getNavn());
            }
            valg = in.nextInt();
            System.out.println("Du har valgt " + brystsvømning.get(valg - 1).getNavn());
            in.nextLine();
            double tidBryst = tagTid();
            System.out.println("tid: " + tidBryst + " sekunder");
            brystsvømning.get(valg - 1).setTid(tidBryst);
            break;
          case 3:
            System.out.println("Hvilken atlet vil du tage tid på?");
            for (int i = 0; i < rygsvømning.size(); i++) {
              System.out.println((i + 1) + ": " + rygsvømning.get(i).getNavn());
            }
            valg = in.nextInt();
            System.out.println("Du har valgt " + rygsvømning.get(valg - 1).getNavn());
            in.nextLine();
            double tidRyg = tagTid();
            System.out.println("tid: " + tidRyg + " sekunder");
            rygsvømning.get(valg - 1).setTid(tidRyg);
            break;
          case 4:
            System.out.println("Hvilken atlet vil du tage tid på?");
            for (int i = 0; i < butterfly.size(); i++) {
              System.out.println((i + 1) + ": " + butterfly.get(i).getNavn());
            }
            valg = in.nextInt();
            System.out.println("Du har valgt " + butterfly.get(valg - 1).getNavn());
            in.nextLine();
            double tidButterfly = tagTid();
            System.out.println("tid: " + tidButterfly + " sekunder");
            butterfly.get(valg - 1).setTid(tidButterfly);
            break;
          case 5:
            konkurrenceErIGang = false;
            break;
        }
      } catch (Exception e) {
        System.out.println("Fejl");
      }
    }
  }

  public double tagTid() {

    System.out.println("Tryk enter for at starte timer");
    in.nextLine();
    stopur.start();
    System.out.println("Tryk 'enter' for at stoppe tiden igen");
    in.nextLine();
    stopur.stop();

    return stopur.tidIMillisekunder() / 1000.00;
  }


  public void sorterDisciplin() {

    Parser parser = new Parser();

    for (int i = 0; i < parser.getKonkurrenceMedlemmer().size(); i++) {
      if (parser.getKonkurrenceMedlemmer().get(i).getDisciplin1().equals("crawl")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin2().equals("crawl")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin3().equals("crawl")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin4().equals("crawl")) {
        crawl.add(parser.getKonkurrenceMedlemmer().get(i));
      } else if (parser.getKonkurrenceMedlemmer().get(i).getDisciplin1().equals("brystsvømning")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin2().equals("brystsvømning")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin3().equals("brystsvømning")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin4().equals("brystsvømning")) {
        brystsvømning.add(parser.getKonkurrenceMedlemmer().get(i));
      } else if (parser.getKonkurrenceMedlemmer().get(i).getDisciplin1().equals("rygsvømning")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin2().equals("rygsvømning")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin3().equals("rygsvømning")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin4().equals("rygsvømning")) {
        rygsvømning.add(parser.getKonkurrenceMedlemmer().get(i));
      } else if (parser.getKonkurrenceMedlemmer().get(i).getDisciplin1().equals("butterfly")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin2().equals("butterfly")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin3().equals("butterfly")
          || parser.getKonkurrenceMedlemmer().get(i).getDisciplin4().equals("butterfly")) {
        butterfly.add(parser.getKonkurrenceMedlemmer().get(i));
      }
    }
  }

  public void visTopFem() {
    System.out.println("Hvilken disciplin vil du se top 5 over?\n" +
        """
            1. Crawl
            2. Brystsvømning
            3. Rygsvømning
            4. Butterfly
            5. Tilbage til hovedmenu""");
    int top5 = in.nextInt();
    switch (top5) {
      case 1:
        for (int i = 0; i <= 4; i++) {
          System.out.println(crawl.get(i).getNavn() + ": " + crawl.get(i).getTid());
        }
        break;
      case 2:
        for (int i = 0; i <= 4; i++) {
          System.out.println(brystsvømning.get(i).getNavn() + ": " + brystsvømning.get(i).getTid());
        }
        break;
      case 3:
        for (int i = 0; i <= 4; i++) {
          System.out.println(rygsvømning.get(i).getNavn() + ": " + rygsvømning.get(i).getTid());
        }
        break;
      case 4:
        for (int i = 0; i <= 4; i++) {
          System.out.println(butterfly.get(i).getNavn() + ": " + butterfly.get(i).getTid());
        }
        break;
    }
  }

  public void skrivTilFil() throws Exception {
    Collections.sort(crawl);
    Collections.sort(rygsvømning);
    Collections.sort(brystsvømning);
    Collections.sort(butterfly);

    for (int i = 0; i <= 4; i++) {
      printCrawlFile.println(crawl.get(i).getNavn() + " " + crawl.get(i).getTid());
      printBrystFile.println(brystsvømning.get(i).getNavn() + " " + brystsvømning.get(i).getTid());
      printRygFile.println(rygsvømning.get(i).getNavn() + " " + rygsvømning.get(i).getTid());
      printButterfly.println(butterfly.get(i).getNavn() + " " + butterfly.get(i).getTid());
    }
  }
}
