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
    public void numOfMillionJumps1() {
        assertEquals(65555556, jump.frog2(33333334, 2000000000, 30), "should return 65555556 jumps");
    }

    @Test
    public void numOfThousandsJumps2() {
        assertEquals(655556, jump.frog3(33333334, 2000000000, 3000), "should return 655556 jumps");
    }
    @Test
    public void nullYJumps1() {
        assertEquals(0, jump.frog1(1, 0, 1), "should return 0 jumps");
    }
    @Test
    public void nullYJumps2() {
        assertEquals(0, jump.frog2(1, 0, 1), "should return 0 jumps");
    }
    @Test
    public void nullYJumps3() {
        assertEquals(0, jump.frog3(1, 0, 1), "should return 0 jumps");
    }
    @Test
    public void nullXJumps1() {
        assertEquals(2, jump.frog1(0, 1, 1), "should return 0 jumps");
    }
    @Test
    public void nullXJumps2() {
        assertEquals(2, jump.frog2(0, 1, 1), "should return 0 jumps");
    }
    @Test
    public void nullXJumps3() {
        assertEquals(2, jump.frog3(0, 1, 1), "should return 0 jumps");
    }
}
