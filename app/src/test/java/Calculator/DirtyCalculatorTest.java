package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirtyCalculatorTest {

    @Test
    void Tests () {
        DirtyCalculator Tes = new DirtyCalculator();
        assertEquals(5,Tes.Sum1(1,2), "must return 5");

        assertEquals(1439,Tes.Sum1(31f,44f),"must return 1439");

        assertEquals(1844616600,Tes.Sum1(42948,42948),"must return 1844616600");

        assertEquals(35.959999999999994,Tes.Sum1(5.6,4.6), "must return 35.959999999999994");
    }
}