package dubautsova;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testStrangeSum(){
        assertEquals(11, Calculator.strangeSum(2,3));
    }
}
