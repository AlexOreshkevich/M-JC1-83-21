package by.academy.jc.klimakhovich_ht3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrogJumper {
    FrogJumper jump = new FrogJumper();


    @Test
    public void numOfMillionsJumps() {
        assertEquals(65555556, jump.frog(33333334, 2000000000, 30), "should return 655555556 jumps");
    }

    @Test
    public void numOfThousandsJumps() {
        assertEquals(655556, jump.frog(33333334, 2000000000, 3000), "should return 655556 jumps");
    }


    @Test
    public void nullYJumps() {
        assertEquals(0, jump.frog(1, 0, 1), "should return 0 jumps");
    }


    @Test
    public void nullXJumps() {
        assertEquals(2, jump.frog(0, 1, 1), "should return 2 jumps");
    }
}