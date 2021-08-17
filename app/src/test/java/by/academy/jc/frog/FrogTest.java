package by.academy.jc.frog;
import by.academy.jc.shorokhov.frog.Frog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogTest {
    Frog frog = new Frog();
    @Test
    public void JumpTest() {
     assertEquals(7, frog.solution(15,200,30), " must be 7 jumps");
    }
    @Test
    public void HugeJumpTest() {
        assertEquals(41, frog.solution1(1214315, 1234315, 500), " must be 41 jumps");
    }

}
