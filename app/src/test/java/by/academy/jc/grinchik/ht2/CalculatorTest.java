package by.academy.jc.grinchik.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void Should_Should_Return_19_When_Sum_3_And_4() {
        Calculator classUnderTest = new Calculator();
        assertEquals(19, classUnderTest.getSum(3, 4));
    }
    @Test
    void Should_Return_0_When_Sum_0_And_0() {
        Calculator classUnderTest = new Calculator();
        assertEquals(0, classUnderTest.getSum(0, 0));
    }
}