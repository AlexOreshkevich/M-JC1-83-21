package by.academy.jc.ht.skopinov.ht14;

import java.util.List;

public class AverageNumber {

  public double getAverageNumber(List<Integer> numbers) throws InterruptedException {

    MyThread calculator0 = new MyThread(numbers, 0, 1000000);
    MyThread calculator1 = new MyThread(numbers, 1000000, 4000000);
    MyThread calculator2 = new MyThread(numbers, 4000000, 6000000);
    MyThread calculator3 = new MyThread(numbers, 6000000, 8000000);
    MyThread calculator4 = new MyThread(numbers, 8000000, 10000000);

    calculator2.setPriority(Thread.MAX_PRIORITY);
    calculator3.setPriority(Thread.MIN_PRIORITY);

    calculator0.start();
    calculator1.start();
    calculator2.start();
    calculator3.start();
    calculator4.start();

    while (calculator0.isAlive() || calculator1.isAlive() || calculator2.isAlive()
        || calculator3.isAlive() || calculator4.isAlive()) {
      Thread.sleep(1000);
    }

    return  (calculator0.getAccumulator() + calculator1.getAccumulator() + calculator2.getAccumulator()
         + calculator3.getAccumulator() + calculator4.getAccumulator()) / numbers.size();
  }
}
