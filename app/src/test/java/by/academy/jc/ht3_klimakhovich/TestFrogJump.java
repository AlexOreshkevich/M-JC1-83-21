package by.academy.jc.ht3_klimakhovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrogJump {
    FrogJump jump = new FrogJump();

    @Test
    public void LittleFrogJump() {
        assertEquals(3, jump.frog(10, 85, 30), "should return 3 jumps");
    }

    @Test
    public void numOfMillionsJumps() {
        assertEquals(65555556, jump.frog(33333334, 2000000000, 30), "should return 655555556 jumps");
    }

    @Test
    public void numOfJumps() {
        assertEquals(0, jump.frog(33333334, 2000000000, 0), "should return 0 jumps");
    }


    @Test
    public void nullYJumps() {
        assertEquals(0, jump.frog(1, 0, 1), "should return 0 jumps");
    }


    @Test
    public void nullXJumps() {
        assertEquals(1, jump.frog(0, 1, 1), "should return 2 jumps");
    }
}
