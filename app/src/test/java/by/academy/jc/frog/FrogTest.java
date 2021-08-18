package by.academy.jc.frog;
import by.academy.jc.shorokhov.frog.Frog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogTest {
    Frog frog = new Frog();
    @Test
    public void JumpTest() {
     assertEquals(2, frog.HugeSolution(1,5,2), " must be 2 jumps");
        assertEquals(7, frog.HugeSolution(10,300,44), " must be 7 jumps");
        assertEquals(11, frog.HugeSolution(20,400,35), " must be 11 jumps");
    }
    @Test
    public void HugeJumpTest() {
        assertEquals(2, frog.HugeSolution(1000000, 5000000, 2000000), " must be 2 jumps");
        assertEquals(3630, frog.HugeSolution(2214315, 4214315, 551), " must be 3630 jumps");
        assertEquals(4943, frog.HugeSolution(3214315, 6244315, 613), " must be 4943 jumps");
    }

}
