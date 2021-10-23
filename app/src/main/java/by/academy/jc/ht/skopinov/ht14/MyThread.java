package by.academy.jc.ht.skopinov.ht14;

import java.util.List;

public class MyThread extends Thread {

  private double accumulator = 0;
  private List<Integer> source;
  private int startInd;
  private int endInd;

  MyThread(List<Integer> source, int startInd, int endInd) {
    this.source = source;
    this.startInd = startInd;
    this.endInd = endInd;
  }

  @Override
  public void run() {
    for (int i = startInd; i < endInd; i++) {
      accumulator += source.get(i);
    }
  }

  public double getAccumulator() {
    return accumulator;
  }
}