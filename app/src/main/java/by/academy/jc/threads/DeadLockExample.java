package by.academy.jc.threads;

public class DeadLockExample {

  public void method1() {
    synchronized (String.class) {
      System.out.println("Acquired lock on String.class object");
      synchronized (Integer.class) {
        System.out.println("Acquired lock on Integer.class object");
      }
    }
  }

  public void method2() {
    synchronized (Integer.class) {
      System.out.println("Acquired lock on Integer.class object");
      synchronized (String.class) {
        System.out.println("Acquired lock on String.class object");
      }
    }
  }

  public static void main(String[] args) {

    DeadLockExample example = new DeadLockExample();

    Runnable t1 = example::method1;
    Runnable t2 = example::method2;

    Thread thread1 = new Thread(t1);
    Thread thread2 = new Thread(t2);

    thread1.start();
    thread2.start();
  }
}
