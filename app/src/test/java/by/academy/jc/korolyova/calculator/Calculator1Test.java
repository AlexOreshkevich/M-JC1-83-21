package by.academy.jc.korolyova.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1Test {

    @Test
    void shouldExpectCorrectResultWhenSum() {
        Calculator1 Tes = new Calculator1();
        assertEquals(5,Tes.sum1(1,2));
    }
}