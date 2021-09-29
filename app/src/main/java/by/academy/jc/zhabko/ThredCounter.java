package by.academy.jc.zhabko;

import java.util.ArrayList;
import java.util.List;

public class ThredCounter {

    static class Thread1 extends Thread {
        volatile double sum;
        volatile double size;
        volatile List <Double> list;

        public Thread1 (List <Double> list) {
            size = list.size();
            this.list=list;

        }

        @Override
        public void run() {
            for (int i=0; i<size; i++) {
                sum += list.get(i);
            }
        }
    }



    public static void main (String[] args) {
        ThredCounter thredCounter = new ThredCounter();



    }

    public Double getAverage (List <Double> list) {
        double sum = 0;
        int limit = list.size();
        for (int i=0; i<limit; i++) {
            sum += list.get(i);
        }
        return sum / limit;
    }



}
