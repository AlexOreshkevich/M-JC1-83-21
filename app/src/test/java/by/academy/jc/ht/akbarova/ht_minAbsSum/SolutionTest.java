package by.academy.jc.ht.akbarova.ht_minAbsSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shouldReturnMinAbsSum() {
        int[] A = {1, 5, 2, -2};
        assertEquals(0, Solution.solution(A));
    }
}