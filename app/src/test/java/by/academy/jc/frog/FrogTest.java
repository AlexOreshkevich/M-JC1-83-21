package by.academy.jc.frog;
import by.academy.jc.shorokhov.frog.Frog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogTest {
    Frog frog = new Frog();
    @Test
    public void JumpTest() {
     assertEquals(7, frog.solution(15,200,30), " must be 7 jumps");
        assertEquals(7, frog.solution(10,300,44), " must be 7 jumps");
        assertEquals(11, frog.solution(20,400,35), " must be 7 jumps");
    }
    @Test
    public void HugeJumpTest() {
        assertEquals(8829, frog.solutionHuge(1214315, 5134315, 444), " must be 41 jumps");
        assertEquals(3630, frog.solutionHuge(2214315, 4214315, 551), " must be 41 jumps");
        assertEquals(4943, frog.solutionHuge(3214315, 6244315, 613), " must be 41 jumps");
    }

}
