package by.academy.jc.ht.sergeichik.ht8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    Solution testSolution = new Solution();

    @Test
    public void shouldReturnNumberOfAliveFish(){
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        assertEquals(2, testSolution.solution(A, B));
    }
    @Test
    public void shouldReturnNumberOfAliveFish1(){
        int[] A = {3, 2, 1};
        int[] B = {1, 1, 1};
        assertEquals(3, testSolution.solution(A, B));
    }
    @Test
    public void shouldReturnNumberOfAliveFish2(){
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 0, 0, 1, 0};
        assertEquals(4, testSolution.solution(A, B));
    }
    @Test
    public void shouldReturnNumberOfAliveFish3(){
        int[] A = {5, 2};
        int[] B = {1, 0};
        assertEquals(1, testSolution.solution(A, B));
    }
}

