package by.academy.jc.ht.shorokhov.ht14;

import java.util.concurrent.RecursiveTask;

public class AverageCalculator {


    static int numOfThread = Runtime.getRuntime().availableProcessors();


    static class MyFork extends RecursiveTask<Double> {
        static int numOfOperations;
        int to, from;


        public MyFork (int from, int to, int numOfOperations){
            this.from = from;
            this.to = to;
            this.numOfOperations = numOfOperations;
        }

        @Override
        protected Double compute() {
            double j = 0;
            if((to-from) <= numOfOperations/numOfThread){

                for(double i = from; i <= to; i++){
                    j = j+i;
                }
                return (j/(numOfOperations+1));
            }   else {

                int middle = (to + from)/2;

                MyFork first = new MyFork(from, middle, numOfOperations);
                first.fork();

                MyFork second = new MyFork(middle+1,to, numOfOperations);
                double secondValue = second.compute();

                return first.join() + secondValue;
            }
        }
    }



}
