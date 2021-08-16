package by.academy.jc.klimakhovich_ht3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {
    Solution jump = new Solution();

    @Test
    public void numOfJumps() {
        assertEquals(3, jump.solution1(10, 85, 30), "should return 3 jumps");
        assertEquals(65555556, jump.solution2(33333334, 2000000000, 30), "should return 65555556 jumps");
    }
}
