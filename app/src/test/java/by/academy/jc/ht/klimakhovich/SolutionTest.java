package by.academy.jc.ht.klimakhovich;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void shouldReturnAmountOfAliveFish1() {
        Solution sol = new Solution();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        assertEquals(2, sol.solution(A, B));
    }

    @Test
    void shouldReturnAmountOfAliveFish2() {
        Solution sol = new Solution();
        int[] A = {12, 34, 2, 8, 36};
        int[] B = {1, 0, 0, 0, 0};
        assertEquals(4, sol.solution(A, B));
    }

    @Test
    void shouldReturnAmountOfAliveFish3() {
        Solution sol = new Solution();
        int[] A = {9999999, 2, 3, 4};
        int[] B = {1, 0, 0, 0};
        assertEquals(1, sol.solution(A, B));
    }

    @Test
    void shouldReturnAmountOfAliveFish4() {
        Solution sol = new Solution();
        int[] A = {9999999, 2, 3, 4};
        int[] B = {1, 1, 1, 1};
        assertEquals(4, sol.solution(A, B));
    }


}