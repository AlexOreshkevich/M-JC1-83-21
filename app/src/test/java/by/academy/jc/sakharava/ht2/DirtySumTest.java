package by.academy.jc.sakharava.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirtySumTest {
    @Test
    void testsum(){
        assertEquals(11, DirtySum.sum(2,3));
    }
}
