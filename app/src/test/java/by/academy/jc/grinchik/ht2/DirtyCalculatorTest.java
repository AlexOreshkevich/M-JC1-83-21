package by.academy.jc.grinchik.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirtyCalculatorTest {

    @Test
    void shouldReturn19WhenSum3And4() {
        DirtyCalculator classUnderTest = new DirtyCalculator();
        assertEquals(19, classUnderTest.getSum(3, 4));
    }
    @Test
    void shouldReturn0WhenSum0And0() {
        DirtyCalculator classUnderTest = new DirtyCalculator();
        assertEquals(0, classUnderTest.getSum(0, 0));
    }
    @Test
    void shouldReturnValidResultWhenSumFloats() {
        DirtyCalculator classUnderTest = new DirtyCalculator();
        assertEquals(2.75f, classUnderTest.getSum(1.5f, 0.5f));
    }
    @Test
    void shouldReturnValidResultWhenSumDoubles() {
        DirtyCalculator classUnderTest = new DirtyCalculator();
        assertEquals(2.75, classUnderTest.getSum(1.5, 0.5));
    }
}