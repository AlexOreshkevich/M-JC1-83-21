package by.academy.jc.klimakhovich_ht3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {
    Solution jump = new Solution();

    @Test
    public void numOfJumps() {
        assertEquals(3, jump.solution1(10, 85, 30), "should return 3 jumps");
        assertEquals(11, jump.solution2(10, 310, 30), "should return 11 jumps");
    }
}
