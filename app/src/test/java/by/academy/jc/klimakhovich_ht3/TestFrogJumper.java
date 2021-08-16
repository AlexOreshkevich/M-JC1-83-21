package by.academy.jc.klimakhovich_ht3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrogJumper {
    FrogJumper jump = new FrogJumper();

    @Test
    public void numOfJumps() {
        assertEquals(3, jump.frog1(10, 85, 30), "should return 3 jumps");
    }

    @Test
    public void numOfMillionJumps() {
        assertEquals(65555556, jump.frog2(33333334, 2000000000, 30), "should return 65555556 jumps");
    }
}
