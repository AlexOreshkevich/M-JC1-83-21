package by.academy.jc.threads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DeadLockExample {

  private String mySurname;

  public void process() {
    // surname -> chars
    Set<Character> letters = new HashSet<>();
    char[] chars = mySurname.toCharArray();
    for (char c : chars) {
      letters.add(c);
    }

    String testSurname = "testsdf";
    List<String> allSurnames = new ArrayList<>();
    List<String> filtered = allSurnames.stream().filter(
        s -> {
          char[] currentChars = s.toCharArray();
          int amountOfMatches = 0;
          for (char letter : currentChars) {
            if (letters.contains(letter)) {
              amountOfMatches++;
            }
          }
          return amountOfMatches >= 2;
        }
    ).collect(Collectors.toList());
  }

  public void method1() {
    synchronized (String.class) {

      System.out.printf(
          "[%s] Acquired lock on String.class object \n",
          Thread.currentThread().getName()
      );
      synchronized (Integer.class) {
        System.out.printf(
            "[%s] Acquired lock on Integer.class object \n",
            Thread.currentThread().getName()
        );
      }
    }
  }

  public void method2() {
    synchronized (Integer.class) {
      System.out.printf(
          "[%s] Acquired lock on Integer.class object \n",
          Thread.currentThread().getName()
      );
      synchronized (String.class) {
        System.out.printf(
            "[%s] Acquired lock on String.class object \n",
            Thread.currentThread().getName()
        );
      }
    }
  }

  public static void main(String[] args) {

    DeadLockExample example = new DeadLockExample();

    Runnable t1 = example::method1;
    Runnable t2 = example::method2;

    Thread thread1 = new Thread(t1, "first");
    Thread thread2 = new Thread(t2, "second");

    thread1.start();
    thread2.start();
  }
}
