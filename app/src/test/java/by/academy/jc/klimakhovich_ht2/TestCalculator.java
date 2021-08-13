package by.academy.jc.klimakhovich_ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Test
    void dirtySum() {
        Calculator classUnderTest = new Calculator();
        assertEquals(45.2, classUnderTest.sum1(5, 6.7), "sum1 should have 45.2");
        assertEquals(21.5, classUnderTest.sum2(3.5, 4), "sum2 should have 21.5");
    }
}