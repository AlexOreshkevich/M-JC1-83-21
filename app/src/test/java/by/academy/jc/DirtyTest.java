package by.academy.jc;

import by.academy.jc.shorokhov.Dirtycalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirtyTest {


    @Test
    public void testSum() {
        Dirtycalculator calculator = new Dirtycalculator();
        assertEquals(15, calculator.sum(10,5)," is equal sum ");
    }
    @Test
    public void testSub() {
        Dirtycalculator calculator = new Dirtycalculator();
        assertEquals(4.5,  calculator.sub(10,5.5)," is equal sub ");
    }
}
