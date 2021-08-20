package by.academy.jc.zaikouskaya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    //working if distance is a multiple of jump length
    @Test
    public void test0() throws IllegalArgumentException {
        Solution test = new Solution();
        assertEquals(4, test.solution(25,85,15));
    }

    //working if distance is not a multiple of jump length
    @Test
    public void test1() throws IllegalArgumentException {
        Solution test = new Solution();
        assertEquals(5, test.solution(20, 85, 15));
    }

    //working if x=y
    @Test
    public void test2() throws IllegalArgumentException {
        Solution test = new Solution();
        assertEquals(0, test.solution(20, 20, 10));
    }

}
