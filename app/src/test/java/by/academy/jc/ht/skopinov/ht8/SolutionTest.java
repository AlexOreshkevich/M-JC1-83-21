package by.academy.jc.ht.skopinov.ht8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution object = new Solution();

  @Test
  void TestFromTask() throws IllegalArgumentException {

    int[] a = {4, 3, 2, 1, 5};
    int[] b = {0, 1, 0, 0, 0};
    assertEquals(2, object.solution(a, b));
  }

  @Test
  void severalFishConflictsAtTheSameTime() throws IllegalArgumentException {

    int[] a = {4, 3, 2, 1, 5, 8, 6, 9, 10, 7};
    int[] b = {0, 1, 0, 1, 0, 1, 0, 0, 1, 0};
    assertEquals(4, object.solution(a, b));
  }

  @Test
  void alternatingDirectionsOfFish() throws IllegalArgumentException {

    int[] a = {1000000, 23, 10, 857, 999, 1, 543, 4634};
    int[] b = {1, 0, 1, 0, 1, 0, 1, 0};
    assertEquals(1, object.solution(a, b));
  }

  @Test
  void oneFish() throws IllegalArgumentException {

    int[] a = {100000};
    int[] b = {1};
    assertEquals(1, object.solution(a, b));
  }

  @Test
  void twoFishThatWillNotMeet() throws IllegalArgumentException {

    int[] a = {100000, 1};
    int[] b = {0, 1};
    assertEquals(2, object.solution(a, b));
  }

  @Test
  void twoFishThatWillMeet() throws IllegalArgumentException {

    int[] a = {100000, 1};
    int[] b = {1, 0};
    assertEquals(1, object.solution(a, b));
  }

  @Test
  void allFishSwimTheSame0() throws IllegalArgumentException {

    int[] a = {4, 3, 2, 1, 5};
    int[] b = {0, 0, 0, 0, 0};
    assertEquals(5, object.solution(a, b));
  }

  @Test
  void allFishSwimTheSame1() throws IllegalArgumentException {

    int[] a = {4, 3, 2, 1, 5};
    int[] b = {1, 1, 1, 1, 1};
    assertEquals(5, object.solution(a, b));
  }
}