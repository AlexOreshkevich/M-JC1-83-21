package by.academy.jc.ht.sergeichik.ht14;

import java.util.List;

public class AverageCounter {

    public static class NewThread extends Thread {

        private double average;
        private final int beginningOfCounter;
        private final int endOfCounter;
        private final List<Integer> collect;


        @Override
        public void run() {
            for (int i = beginningOfCounter; i < endOfCounter; i++) {
                average += collect.get(i);
            }
        }


        public NewThread(List<Integer> collect, int beginningOfCounter, int endOfCounter) {
            this.beginningOfCounter = beginningOfCounter;
            this.endOfCounter = endOfCounter;
            this.collect = collect;
        }

        public double getAverage() {
            return average;
        }

    }

    synchronized double sumOfThreads (List<Integer> order) throws InterruptedException {

        AverageCounter.NewThread thread = new AverageCounter.NewThread(order, 0, 567);
        AverageCounter.NewThread thread1 = new AverageCounter.NewThread(order, 567, 12783);
        AverageCounter.NewThread thread2 = new AverageCounter.NewThread(order, 12783, 20000);

        thread.start();
        thread1.start();
        thread2.start();


        while(thread.isAlive() || thread1.isAlive() || thread2.isAlive()){
            Thread.sleep(500);
        }

        return (thread.getAverage() + thread1.getAverage() + thread2.getAverage()) / order.size();
    }
}