package by.academy.jc.exception;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Demonstrates how to store information of any exception that was thrown by the application, and
 * amount of throws.
 *
 * @author Aliaksandr Arashkevich
 */
public class SpyExceptionDemo {

  public static class CustomHandler implements Thread.UncaughtExceptionHandler {

    // maps exception class type to amount of throws
    private Map<Class<? extends Throwable>, Integer> exceptionCaughtMap;

    private static CustomHandler INSTANCE;

    private static final Logger LOGGER = Logger.getLogger(CustomHandler.class.getName());

    private CustomHandler() {
      exceptionCaughtMap = new HashMap<>();
    }

    public static synchronized CustomHandler getInstance() {
      if (INSTANCE == null) {
        synchronized (CustomHandler.class) {
          INSTANCE = new CustomHandler();
        }
      }

      return INSTANCE;
    }

    public void displayExceptionStats() {
      exceptionCaughtMap.forEach((k, v) -> LOGGER.info(
          String.format("Exception type %s happened %d times.", k.getSimpleName(), v)
      ));
    }

    /**
     * Method invoked when the given thread terminates due to the given uncaught exception.
     * <p>Any exception thrown by this method will be ignored by the
     * Java Virtual Machine.
     *
     * @param t the thread
     * @param e the exception
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {
      LOGGER.warning("uncaught Exception from thread " + t.getName() + ": " + e.getMessage());

      Class<? extends Throwable> exceptionType = e.getClass();
      exceptionCaughtMap.put(
          exceptionType,
          exceptionCaughtMap.computeIfAbsent(exceptionType, aClass -> 0) + 1
      );
    }
  }

  public static void main(String[] args) throws InterruptedException {

    Thread.setDefaultUncaughtExceptionHandler(
        CustomHandler.getInstance()
    );

    Runnable r1 = () -> {
      String s = null;
      System.out.print(s.getBytes());
    };

    Runnable r2 = () -> {
      System.out.println(12 / 0);
    };

    List<Thread> threads = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      if (i % 3 == 0) {
        Thread temp1 = new Thread(r1,"First thread (NPE)");
        threads.add(temp1);
        temp1.start();
      }
      else {
        Thread temp2 = new Thread(r2,"Arithmetic exception thread");
        threads.add(temp2);
        temp2.start();
      }
    }

    Thread.sleep(5000);

    System.out.println("Display everything what happened:\n");
    CustomHandler.getInstance().displayExceptionStats();
  }
}
