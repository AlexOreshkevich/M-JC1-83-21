package by.academy.jc.sakharava.ht2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class DirtyDivTest {
        @Test
        void testdiv(){
            assertEquals(7, DirtyDiv.div(3.5d,0.5d));
        }
    }
