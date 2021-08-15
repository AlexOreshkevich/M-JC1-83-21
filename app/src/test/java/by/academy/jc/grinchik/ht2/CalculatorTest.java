package by.academy.jc.grinchik.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void ShouldReturn19WhenSum3And4() {
        Calculator classUnderTest = new Calculator();
        assertEquals(19, classUnderTest.getSum(3, 4));
    }
    @Test
    void ShouldReturn0WhenSum0And0() {
        Calculator classUnderTest = new Calculator();
        assertEquals(0, classUnderTest.getSum(0, 0));
    }
}