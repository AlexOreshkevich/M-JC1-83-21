package by.academy.jc.ht.shorokhov.ht14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageCalculatorTest {

    @Test
     void CalculatorWithForkJoinTest() {

       List<Integer> list = new ArrayList<>();
        for(int i = 0; i<=10000000; i++){
            list.add(i);
        }

        double average = list.stream().
                mapToInt(Integer::intValue).average().getAsDouble();



        AverageCalculator.MyFork example = new AverageCalculator.MyFork(0, 10000000,10000000);

       assertEquals(average,example.compute());

    }


    @Test
    public void CalculatorSecTest() {

        AverageCalculator.MyFork example = new AverageCalculator.MyFork(0, 10000000,10000000);
        long startTime = System.currentTimeMillis();
        example.compute();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println((double)elapsedTime/1000 + " seconds");
    }


}





