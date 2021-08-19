package by.academy.jc.dubautsova1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void shouldReturnMissingInteger3() {
        int[] A = {2, 4, 8, 1, 9};
        assertEquals(3, Solution.solution(A));
    }
    @Test
    public void shouldReturnMissingInteger1() {
        int[] B = {-2, -111100, -68, -980};
        assertEquals(1, Solution.solution(B));
    }
    @Test
    public void shouldReturnMissingInteger9() {
        int[] C = {-2, -4, 8, -1};
        assertEquals(9, Solution.solution(C));
    }
}
