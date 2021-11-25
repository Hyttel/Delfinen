package Konkurrence;

import java.io.PrintStream;

public class Filstyring {

  String crawlFile = "topCrawl.txt";
  String brystFile = "topBryst.txt";
  String rygFile = "topRyg.txt";
  String butterflyFile = "topButterfly.txt";
  PrintStream printCrawlFile;
  PrintStream printBrystFile;
  PrintStream printRygFile;
  PrintStream printButterfly;

  public void opretFiler() {
    try {
      printCrawlFile = new PrintStream(crawlFile);
      printBrystFile = new PrintStream(brystFile);
      printRygFile = new PrintStream(rygFile);
      printButterfly = new PrintStream(butterflyFile);
    } catch (Exception exception) {
      System.out.println("fejl ved oprettelse af filer");
    }
  }

  public PrintStream getCrawlFile() {
    return printCrawlFile;
  }
  public PrintStream getPrintBrystFile() {
    return printBrystFile;
  }

  public PrintStream getPrintButterfly() {
    return printButterfly;
  }

  public PrintStream getPrintRygFile() {
    return printRygFile;
  }
}