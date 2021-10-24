package by.academy.jc.ht.sergeichik.ht14;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageCounterTest {

    @Test
    void testOfAverageNumbers() throws InterruptedException {
        List<Integer> number = new LinkedList<>();
        for (int i = 0; i < 20000; i++){
            number.add(i);
        }

        double average = number.stream().mapToInt(Integer::intValue).average().getAsDouble();

    assertEquals(average, new AverageCounter().sumOfThreads(number));
    }
}
