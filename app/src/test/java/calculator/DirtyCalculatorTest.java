package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirtyCalculatorTest {

    @Test
    void shouldExpect5WhenA1andB2() {
        DirtyCalculator Tes = new DirtyCalculator();
        assertEquals(5,Tes.sum1(1,2), "must return 5");
    }
    @Test
    void shouldExpect1439WhenA31fand44f() {
        DirtyCalculator Tes = new DirtyCalculator();
        assertEquals(1439f,Tes.sum1(31f,44f),"must return 1439f");
    }
    @Test
    void shouldExpectCorrectResultWhenSumDouble() {
        DirtyCalculator Tes = new DirtyCalculator();
        assertEquals(35.959999999999994,Tes.sum1(5.6,4.6), "must return 35.959999999999994");
    }
}