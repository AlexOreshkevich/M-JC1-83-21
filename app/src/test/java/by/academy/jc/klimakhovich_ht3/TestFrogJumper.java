package by.academy.jc.klimakhovich_ht3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrogJumper {
    FrogJumper jump1 = new FrogJumper();
    FrogJumper jump2 = new FrogJumper();
    FrogJumper jump3 = new FrogJumper();

    @Test
    public void numOfJumps() {
        assertEquals(3, jump1.frog1(10, 85, 30), "should return 3 jumps");
    }

    @Test
    public void numOfMillionJumps1() {
        assertEquals(65555556, jump2.frog2(33333334, 2000000000, 30), "should return 65555556 jumps");
    }

    @Test
    public void numOfThousandsJumps2() {
        assertEquals(655556, jump3.frog3(33333334, 2000000000, 3000), "should return 655556 jumps");
    }
}
