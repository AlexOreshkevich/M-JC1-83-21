package by.academy.jc.threads;

public class DeadLockExample {

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
