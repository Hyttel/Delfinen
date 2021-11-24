package Konkurrence;

public class Stopur {
  private final int nanoSekunderPerMillisekunder = 1000000;
  private long stopurStart = 0;
  private long stopurStop = 0;
  private boolean stopurIGang = false;

  public void start() {
    this.stopurStart = System.nanoTime();
    this.stopurIGang = true;
  }
  public void stop() {
    this.stopurStop = System.nanoTime();
    this.stopurIGang = false;
  }
  public long tidIMillisekunder() {
    long tid;

    if (stopurIGang)
      tid = (System.nanoTime() - stopurStart);
    else
      tid = (stopurStop - stopurStart);

    return tid / nanoSekunderPerMillisekunder;
  }
}
