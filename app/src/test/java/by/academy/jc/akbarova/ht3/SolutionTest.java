package by.academy.jc.akbarova.ht3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void shouldReturnNumbersOfJumps1() {

        assertEquals(3, Solution.solution(10, 85, 30));
    }

    @Test
    public void shouldReturnNumbersOfJumps2() {
        assertEquals(1, Solution.solution(10, 10, 30));
    }

    @Test
    public void shouldReturnNumbersOfJumps3() {
        assertEquals(0, Solution.solution(0, 0, 30));
    }

}