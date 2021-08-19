package by.academy.jc.ht3_klimakhovich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrogJump {
    FrogJump jump = new FrogJump();

    @Test
    public void littleFrogJump() {
        assertEquals(3, jump.frog(10, 85, 30), "should return 3 jumps");
    }

    @Test
    public void numOfMillionsJumps() {
        assertEquals(65555556, jump.frog(33333334, 2000000000, 30), "should return 655555556 jumps");
    }

    @Test
    public void numOfJumps1() {
        assertEquals(0, jump.frog(33333334, 2000000000, 0), "should return 0 jumps");
    }


    @Test
    public void nullYJumps() {
        assertEquals(1, jump.frog(1, 100, 100), "should return 1 jump");
    }


    @Test
    public void nullXCoordinate() {
        assertEquals(10, jump.frog(0, 100, 10), "should return 10 jumps");
    }

    @Test
    public void coordinateXBiggerThanY() {
        assertEquals(0, jump.frog(101, 100, 10), "should return 0 jumps");
    }
}