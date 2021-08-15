package by.academy.jc;

import by.academy.jc.shorokhov.DirtyUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirtyTest {
    DirtyUtils calculator = new DirtyUtils();

    @Test
    public void testSumInt() {

        assertEquals(11, calculator.sum(1,5)," is equal sumInt ");
    }
    @Test
    public void testSumDouble() {

        assertEquals(32.75,  calculator.sum(6.5,3.5)," is equal sumDouble ");
    }
}
