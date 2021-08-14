package by.academy.jc.akbaroba.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldReturnSums() {

        assertEquals(20, Calculator.sumAndMultiply(2, 6), "result should be 20");
        assertEquals(70, Calculator.sumAndMultiply(1, 6, 9), "result should be 70");
    }

}