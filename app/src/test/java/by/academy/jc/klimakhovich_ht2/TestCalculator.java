package by.academy.jc.klimakhovich_ht2;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalculator {
    private final Calculator calculator = new Calculator();
    @Test
    void dirtySum() {
        DirtyCalculator classUnderTest = new DirtyCalculator();
        assertEquals(45.2, classUnderTest.sum1(5, 6.7), "sum1 should have 45.2");
        assertEquals(21.5, classUnderTest.sum2(3.5, 4), "sum2 should have 21.5");
        assertEquals(11, classUnderTest.sum(), "sum should have 11");
    }
}