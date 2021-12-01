package Konkurrence;

import java.io.PrintStream;

public class Filstyring {

  String crawlFile = "topCrawl.txt";
  String brystFile = "topBryst.txt";
  String rygFile = "topRyg.txt";
  String butterflyFile = "topButterfly.txt";
  String crawlTop5File = "crawlTop5.txt";
  String brystTop5File = "brystTop5.txt";
  String rygTop5File = "rygTop5.txt";
  String butterflyTop5File = "butterTop5.txt";

  PrintStream printCrawlFile;
  PrintStream printBrystFile;
  PrintStream printRygFile;
  PrintStream printButterfly;
  PrintStream top5Crawl;
  PrintStream top5Bryst;
  PrintStream top5Ryg;
  PrintStream top5Butterfly;

  public void opretFiler() {
    try {
      printCrawlFile = new PrintStream(crawlFile);
      printBrystFile = new PrintStream(brystFile);
      printRygFile = new PrintStream(rygFile);
      printButterfly = new PrintStream(butterflyFile);
      top5Crawl = new PrintStream(crawlTop5File);
      top5Bryst = new PrintStream(brystTop5File);
      top5Ryg = new PrintStream(rygTop5File);
      top5Butterfly = new PrintStream(butterflyTop5File);

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
  public PrintStream getPrintRygFile() {
    return printRygFile;
  }
  public PrintStream getPrintButterfly() {
    return printButterfly;
  }
  public PrintStream getTop5Crawl() {
    return top5Crawl;
  }
  public PrintStream getTop5Bryst() {
    return top5Bryst;
  }
  public PrintStream getTop5Ryg() {
    return top5Ryg;
  }
  public PrintStream getTop5Butterfly() {
    return top5Butterfly;
  }
}
