package by.academy.jc.ht.zhabko;


import java.util.List;

public class AverageCounterThreads {

    List<Integer> sourceList;

    private static class ThreadCounter extends Thread {
        private int averageSum;
        private int start;
        private int end;
        private  List<Integer> techSourceList;

        private ThreadCounter (List <Integer> techSourceList, int start, int end) {
            this.techSourceList = techSourceList;
            this.start = start;
            this.end = end;
        }

        private int getAverageSum() {
            return averageSum;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                averageSum += techSourceList.get(i);
            }
        }
    }

    public AverageCounterThreads(List <Integer> sourceList) {
        this.sourceList = sourceList;
    }

    public synchronized double getAverageSumByEightThreads() throws InterruptedException {

        double resultAverageSum;

        int startIndexFirstThread = 0;

        int startIndexSecondThread = sourceList.size() / 8 + 1;

        int startIndexThirdThread = 2 * sourceList.size() / 8 + 1;

        int startIndex4thThread = 3 * sourceList.size() / 8 + 1;

        int startIndex5thThread = 4 * sourceList.size() / 8 + 1;

        int startIndex6thThread = 5 * sourceList.size() / 8 + 1;

        int startIndex7thThread = 6 * sourceList.size() / 8 + 1;

        int startIndex8thThread = 7 * sourceList.size() / 8 + 1;

        ThreadCounter counter1 = new ThreadCounter(sourceList,startIndexFirstThread,startIndexSecondThread);


        ThreadCounter counter2 = new ThreadCounter(sourceList,startIndexSecondThread,startIndexThirdThread);


        ThreadCounter counter3 = new ThreadCounter(sourceList,startIndexThirdThread,startIndex4thThread);


        ThreadCounter counter4 = new ThreadCounter(sourceList,startIndex4thThread,startIndex5thThread);


        ThreadCounter counter5 = new ThreadCounter(sourceList,startIndex5thThread,startIndex6thThread);


        ThreadCounter counter6 = new ThreadCounter(sourceList,startIndex6thThread,startIndex7thThread);


        ThreadCounter counter7 = new ThreadCounter(sourceList,startIndex7thThread,startIndex8thThread);


        ThreadCounter counter8 = new ThreadCounter(sourceList,startIndex8thThread,sourceList.size());


        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();
        counter5.start();
        counter6.start();
        counter7.start();
        counter8.start();


        while (counter1.isAlive() || counter2.isAlive() || counter3.isAlive() || counter4.isAlive() ||
                counter5.isAlive() || counter6.isAlive() || counter7.isAlive() || counter8.isAlive()) {
            System.out.println("Calculation");
            Thread.sleep(300);
        }


        resultAverageSum = (double) (counter1.getAverageSum() + counter2.getAverageSum() + counter3.getAverageSum()
                + counter4.getAverageSum() + counter5.getAverageSum() + counter6.getAverageSum() + counter7.getAverageSum()
                + counter8.getAverageSum()) / sourceList.size();

        return resultAverageSum;

    }
}
