package dubautsova;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    // I tried to change testStrangeSum() on shouldReturn..., but I faced to some problems :(
    public void testStrangeSum() {
        assertEquals(14.75, Calculator.strangeSum(2.5, 3.5));
        assertEquals(11, Calculator.strangeSum(2, 3));
        assertEquals(-5, Calculator.strangeSum(3, -2));
    }
    @Test
    public void testStrangeMultiplication() {
        assertEquals(13, Calculator.strangeMultiplication(3,2));
        assertEquals(18.5, Calculator.strangeMultiplication(2.5,3.5));
        assertEquals(13, Calculator.strangeMultiplication(-2,3));
    }
}
