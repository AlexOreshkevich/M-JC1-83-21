package by.academy.jc.grinchik.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldReturn19WhenSum3And4() {
        Calculator classUnderTest = new Calculator();
        assertEquals(19, classUnderTest.getSum(3, 4));
    }
    @Test
    void shouldReturn0WhenSum0And0() {
        Calculator classUnderTest = new Calculator();
        assertEquals(0, classUnderTest.getSum(0, 0));
    }
    @Test
    void shouldReturnValidResultWhenSumFloats() {
        Calculator classUnderTest = new Calculator();
        assertEquals(2.75f, classUnderTest.getSum(1.5f, 0.5f));
    }
    @Test
    void shouldReturnValidResultWhenSumDoubles() {
        Calculator classUnderTest = new Calculator();
        assertEquals(2.75, classUnderTest.getSum(1.5, 0.5));
    }
}