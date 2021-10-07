package by.academy.jc.ht.zhabko;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AverageCounterThreadsTest {


    @Test
    void shouldReturnAverageSumOfIntegerList() throws InterruptedException {


        List <Integer> testList = Arrays.asList(
                0,1,2,3,4,5,6,7,8,9
        );

        AverageCounterThreads averageCounterThreads = new AverageCounterThreads(testList);

        assertEquals(4.5,averageCounterThreads.getAverageSumByEightThreads());



    }

    @Test
    void shouldReturnAverageSumOfABigIntegerList() throws InterruptedException {
        List <Integer> testList = new LinkedList<>();

        for (long i = 0; i < 10000; i++) {
            testList.add((int) (Math.random()*200));
        }

        int techSum = 0;
        for (int e : testList) {
            techSum += e;
        }

        AverageCounterThreads averageCounterThreads = new AverageCounterThreads(testList);

        assertEquals((double) techSum/testList.size(),averageCounterThreads.getAverageSumByEightThreads());

    }
}
