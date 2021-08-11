package by.academy.jc;

import by.academy.jc.shorokhov.Dirty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirtyTest {


    @Test
    public void testSum() {
        Dirty calculator = new Dirty();
        assertEquals(15, calculator.sum(10,5)," is equal sum ");
    }
    @Test
    public void testSub() {
        Dirty calculator = new Dirty();
        assertEquals(3.0,  calculator.sub(6.5,3.5)," is equal sub ");
    }
}
