package by.academy.jc.skopinov.ht3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  // random parameter values test
  @Test
  void test1() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(3, test.solution(10,85,30));
  }

  // x and y are equal
  @Test
  void test2() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1,1,1000000000));
  }

  // x greater than y
  @Test
  void test3() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1000000000,1,1));
  }

  // distance is a multiple of jump length
  @Test
  void test4() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(3, test.solution(100,1000,300));
  }

  // extreme parameter values 1
  @Test
  void test5() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1,1,1));
  }

  // extreme parameter values 2
  @Test
  void test6() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(0, test.solution(1000000000,1000000000,1000000000));
  }

  // extreme parameter values 3
  @Test
  void test7() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(999999999, test.solution(1,1000000000,1));
  }

  // extreme parameter values 4
  @Test
  void test8() throws IllegalArgumentException {
    Solution test = new Solution();
    assertEquals(1, test.solution(1,1000000000,1000000000));
  }

}