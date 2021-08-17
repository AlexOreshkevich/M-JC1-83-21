package by.academy.jc.zhabko.ht3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution sol1 = new Solution();
    Solution sol2 = new Solution();

    @Test
    public void shouldReturnNumberOfJumps1() {
        assertEquals(3, sol1.solution(10,85,30));
        assertEquals(22222221,sol1.solution(65,1000000000,45));
    }

    @Test

    public void shouldReturnNumberOfJumps2() {
        assertEquals(3, sol2.solutionSmart(10,85,30));
        assertEquals(22222221,sol2.solutionSmart(65,1000000000,45));
        assertEquals(3,sol2.solutionSmart(10,100,30));
    }
}
