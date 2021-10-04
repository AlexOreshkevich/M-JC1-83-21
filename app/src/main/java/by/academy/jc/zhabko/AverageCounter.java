package by.academy.jc.zhabko;

import java.util.concurrent.RecursiveAction;

public class AverageCounter extends RecursiveAction {

    private double[] sourceArray;
    private int start;
    private int end;
    private double[] destinationArray;
    protected static int sThreshhold;
    double averageSum;

    public AverageCounter (double[] srcA, int s, int e, double[] dstA) {
        sourceArray = srcA;
        start = s;
        end = e;
        destinationArray = dstA;
    }

    protected void computeDirectly() {
        double techAverageSum = 0;
        for (int index = start; index < end; index++ ) {
            techAverageSum += sourceArray[index];
        }

        averageSum = techAverageSum / (end - start);

    }



    @Override
    protected void compute() {
        if (sourceArray.length < sThreshhold) {
            computeDirectly();
            return;
        }

        int split = sourceArray.length / 2;

        invokeAll(new AverageCounter(sourceArray, start, start + split, destinationArray), new AverageCounter(sourceArray, start + split, sourceArray.length - split, destinationArray));

    }

    public static void main(String[] args) {
        double[] arrayFirst = {5.0,};
    }
}
