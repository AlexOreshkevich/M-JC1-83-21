package by.academy.jc.threads;

import java.util.Arrays;
import java.util.List;

public class AverageCalculator {

  static class ThreadCalculator extends Thread {

    private double accumulator = 0;
    private List<Integer> source;
    private int startInd;
    private int endInd;

    ThreadCalculator(List<Integer> source, int startInd, int endInd) {
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

  public static void main(String[] args) throws InterruptedException {

    List<Integer> numbers = Arrays.asList(
        1, 2, 3, 4, 5, 6, 7
    );

    ThreadCalculator calculator1 = new ThreadCalculator(numbers, 0, 2);
    calculator1.start();

    ThreadCalculator calculator2 = new ThreadCalculator(numbers, 2, numbers.size());
    calculator2.start();

    while (calculator1.isAlive() || calculator2.isAlive()) {
      System.out.println("Continue calculation...");
      Thread.sleep(3000);
    }

    double threadAverage = (calculator1.getAccumulator() + calculator2.getAccumulator())/numbers.size();

    System.out.println(threadAverage);

    System.out.println(numbers.stream().mapToInt(value -> value).average().getAsDouble());
  }
}
