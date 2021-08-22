package by.academy.jc.dubautsova1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void shouldReturnMissingInteger2() {
        int[] A = {3, 4, 8, 1, 9};
        assertEquals(2, Solution.solution(A));
    }

    @Test
    public void shouldReturnMissingInteger1() {
        int[] B = {-2, -111100, -68, -980};
        assertEquals(1, Solution.solution(B));
    }

    @Test
    public void shouldReturnMissingInteger01() {
        int[] C = {2, 4, 8};
        assertEquals(1, Solution.solution(C));
    }

    @Test
    public void shouldReturnMissingInteger001() {
        int[] C = {-2, 4, 8};
        assertEquals(1, Solution.solution(C));
    }

    @Test
    public void shouldReturnMissingInteger02() {
        int[] C = {-2, 1, 4, 8};
        assertEquals(2, Solution.solution(C));
    }

    @Test
    public void shouldReturnMissingInteger5() {
        int[] C = {1, 3, 7, 4, 2, 1};
        assertEquals(5, Solution.solution(C));
    }
}

