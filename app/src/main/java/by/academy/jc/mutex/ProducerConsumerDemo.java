package by.academy.jc.mutex;

public class ProducerConsumerDemo {

  public static void main(String[] args) throws InterruptedException {

    // Object of a class that has both produce()
    // and consume() methods
    final Monitor monitor = Monitor.of();

    // Create producer thread
    Thread producer = new Thread(() -> {
      try {
        monitor.produce();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    // Create consumer thread
    Thread consumer = new Thread(() -> {
      try {
        monitor.consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    // Start both threads
    producer.start();
    consumer.start();

    // producer finishes before consumer
    producer.join();
    consumer.join();
  }
}