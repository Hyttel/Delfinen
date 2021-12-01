package Konkurrence;
//Alle i gruppen har kodet denne klasse i fællesskab

import Diverse.Medlem;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;


public class Konkurrencestyring {
  ArrayList<Konkurrencesvømmer> crawl = new ArrayList<>();
  ArrayList<Konkurrencesvømmer> brystsvømning = new ArrayList<>();
  ArrayList<Konkurrencesvømmer> rygsvømning = new ArrayList<>();
  ArrayList<Konkurrencesvømmer> butterfly = new ArrayList<>();
  Filstyring filstyring = new Filstyring();

  boolean konkurrenceErIGang = true;
  Scanner in = new Scanner(System.in);
  Stopur stopur = new Stopur();

  public void startKonkurrence() {
    filstyring.opretFiler();

    while (konkurrenceErIGang) {
      System.out.println("Hvilken disciplin vil du tage tid på?\n" +
          """
              1. Crawl
              2. Brystsvømning
              3. Rygsvømning
              4. Butterfly
              5. Tilbage til hovedmenu""");

      int beslutning = in.nextInt();
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
          filstyring.getCrawlFile().println(crawl.get(valg - 1).getNavn() + " " + crawl.get(valg - 1).getTid());
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
          filstyring.getPrintBrystFile().println(brystsvømning.get(valg - 1).getNavn() + " "
              + brystsvømning.get(valg - 1).getTid());
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
          filstyring.getPrintRygFile().println(rygsvømning.get(valg - 1).getNavn() + " "
              + rygsvømning.get(valg - 1).getTid());
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
          filstyring.getPrintButterfly().println(butterfly.get(valg - 1).getNavn() + " "
              + butterfly.get(valg - 1).getTid());
          break;
        case 5:
          konkurrenceErIGang = false;
          break;
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


  public void sorterDisciplin(ArrayList<Konkurrencesvømmer> konkurrenceMedlemmer) {

    for (int i = 0; i < konkurrenceMedlemmer.size(); i++) {
      if (konkurrenceMedlemmer.get(i).getDisciplin1().equals("crawl")
          || konkurrenceMedlemmer.get(i).getDisciplin2().equals("crawl")
          || konkurrenceMedlemmer.get(i).getDisciplin3().equals("crawl")
          || konkurrenceMedlemmer.get(i).getDisciplin4().equals("crawl")) {
        crawl.add(konkurrenceMedlemmer.get(i));
      } else if (konkurrenceMedlemmer.get(i).getDisciplin1().equals("brystsvømning")
          || konkurrenceMedlemmer.get(i).getDisciplin2().equals("brystsvømning")
          || konkurrenceMedlemmer.get(i).getDisciplin3().equals("brystsvømning")
          || konkurrenceMedlemmer.get(i).getDisciplin4().equals("brystsvømning")) {
        brystsvømning.add(konkurrenceMedlemmer.get(i));
      } else if (konkurrenceMedlemmer.get(i).getDisciplin1().equals("rygsvømning")
          || konkurrenceMedlemmer.get(i).getDisciplin2().equals("rygsvømning")
          || konkurrenceMedlemmer.get(i).getDisciplin3().equals("rygsvømning")
          || konkurrenceMedlemmer.get(i).getDisciplin4().equals("rygsvømning")) {
        rygsvømning.add(konkurrenceMedlemmer.get(i));
      } else if (konkurrenceMedlemmer.get(i).getDisciplin1().equals("butterfly")
          || konkurrenceMedlemmer.get(i).getDisciplin2().equals("butterfly")
          || konkurrenceMedlemmer.get(i).getDisciplin3().equals("butterfly")
          || konkurrenceMedlemmer.get(i).getDisciplin4().equals("butterfly")) {
        butterfly.add(konkurrenceMedlemmer.get(i));
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

    try{
      Scanner readCrawl = new Scanner(new File("topCrawl.txt"));
      Scanner readBryst = new Scanner(new File("topBryst.txt"));
      Scanner readRyg = new Scanner(new File("topRyg.txt"));
      Scanner readButterfly = new Scanner(new File("topButterfly.txt"));

      readCrawl.useLocale(Locale.US);
      readBryst.useLocale(Locale.US);
      readRyg.useLocale(Locale.US);
      readButterfly.useLocale(Locale.US);

      ArrayList<Konkurrencesvømmer> topFemCrawl = new ArrayList<>();
      ArrayList<Konkurrencesvømmer> topFemBryst = new ArrayList<>();
      ArrayList<Konkurrencesvømmer> topFemRyg = new ArrayList<>();
      ArrayList<Konkurrencesvømmer> topFemButterfly = new ArrayList<>();

    int top5 = in.nextInt();

    switch (top5) {
      case 1:
        while(readCrawl.hasNext()) {
          String navn = readCrawl.next();
          double tid = readCrawl.nextDouble();
          topFemCrawl.add(new Konkurrencesvømmer(navn, tid));
        }
          Collections.sort(topFemCrawl);
        if (topFemCrawl.size() >=5) {
          for (int i = 0; i <= 4; i++) {
            System.out.println(topFemCrawl.get(i).getNavn() + ": " + topFemCrawl.get(i).getTid());
            filstyring.getTop5Crawl().println(topFemCrawl.get(i).getNavn() + " "
                + topFemCrawl.get(i).getTid());
          }
        }
        else System.out.println("Der er ikke 5 svømmere i denne kategori");
        break;
      case 2:
        while(readBryst.hasNext()){
          String navn = readBryst.next();
          double tid = readBryst.nextDouble();
          topFemBryst.add(new Konkurrencesvømmer(navn,tid));
        }
        Collections.sort(topFemBryst);
        if (topFemBryst.size() >=5) {
          for (int i = 0; i <= 4; i++) {
            System.out.println(topFemBryst.get(i).getNavn() + ": " + topFemBryst.get(i).getTid());
            filstyring.getTop5Bryst().println(topFemBryst.get(i).getNavn() + " "
                + topFemBryst.get(i).getTid());
          }
        }
        else System.out.println("Der er ikke 5 svømmere i denne kategori");
        break;
      case 3:
        while(readRyg.hasNext()){
          String navn = readRyg.next();
          double tid = readRyg.nextDouble();
          topFemRyg.add(new Konkurrencesvømmer(navn,tid));
        }
        Collections.sort(topFemRyg);
        if (topFemRyg.size() >=5) {
        for (int i = 0; i <= 4; i++) {
          System.out.println(topFemRyg.get(i).getNavn() + ": " + topFemRyg.get(i).getTid());
          filstyring.getTop5Ryg().println(topFemRyg.get(i).getNavn() + " "
              + topFemRyg.get(i).getTid());
          }
        }
        else System.out.println("Der er ikke 5 svømmere i denne kategori");
        break;
      case 4:
        while(readButterfly.hasNext()){
          String navn = readButterfly.next();
          double tid = readButterfly.nextDouble();
          topFemButterfly.add(new Konkurrencesvømmer(navn,tid));
        }
        Collections.sort(topFemButterfly);
        if (topFemButterfly.size() >=5) {
        for (int i = 0; i <= 4; i++) {
          System.out.println(topFemButterfly.get(i).getNavn() + ": " + topFemButterfly.get(i).getTid());
          filstyring.getTop5Butterfly().println(topFemButterfly.get(i).getNavn() + " "
              + topFemButterfly.get(i).getTid());
          }
        }
        else System.out.println("Der er ikke 5 svømmere i denne kategori");
        break;
    }
    } catch (IOException exception) {
      System.out.println("Kan ikke finde filerne på computeren");
    }
  }
}

