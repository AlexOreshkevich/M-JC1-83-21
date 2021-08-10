package by.academy.jc;

import by.academy.jc.shorokhov.DirtyCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirtyTest {
    DirtyCalculator calculator = new DirtyCalculator();
    double sum = calculator.sum(1.5,4);
    double testSum = 5.5;
    double sub = calculator.sub(2.5,3);
    double testSub = -0.5;

    @Test
    public void testSum() {
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum, testSum);
        System.out.println("@Test sub(): " + sub + " = " + testSub);
        assertEquals(sub, testSub);
    }
}
