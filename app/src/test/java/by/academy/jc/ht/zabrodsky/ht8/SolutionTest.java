package by.academy.jc.ht.zabrodsky.ht8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void returnsTheNumberOfLiveFish1() {
    Solution object = new Solution();
    int[] A = {4, 3, 2, 1, 5};
    int[] B = {0, 1, 0, 0, 0};
    assertEquals(2, object.solution(A, B));
  }

  @Test
  void returnsTheNumberOfLiveFish2() {
    Solution object = new Solution();
    int[] A = {4, 7, 2, 8, 5};
    int[] B = {1, 1, 0, 1, 0};
    assertEquals(3, object.solution(A, B));
  }

  @Test
  void returnsTheNumberOfLiveFish3() {
    Solution object = new Solution();
    int[] A = {5, 4, 1, 3};
    int[] B = {1, 0, 0, 0};
    assertEquals(1, object.solution(A, B));
  }

  @Test
  void returnsTheNumberOfLiveFish4() {
    Solution object = new Solution();
    int[] A = {3, 2, 1};
    int[] B = {1, 0, 0};
    assertEquals(1, object.solution(A, B));
  }

  @Test
  void returnsTheNumberOfLiveFish5() {
    Solution object = new Solution();
    int[] A = {3};
    int[] B = {1};
    assertEquals(1, object.solution(A, B));
  }

  @Test
  void returnsTheNumberOfLiveFish6() {
    Solution object = new Solution();
    int[] A = {3, 2};
    int[] B = {1, 0};
    assertEquals(1, object.solution(A, B));
  }

  @Test
  void returnsTheNumberOfLiveFish7() {
    Solution object = new Solution();
    int[] A = {3, 2};
    int[] B = {1, 1};
    assertEquals(2, object.solution(A, B));
  }

}
